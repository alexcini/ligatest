package br.com.liga.ligatest;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import br.com.liga.ligatest.model.Occurrence;

public class GoogleMapsActivity extends Activity {
    private WebView myWebView;
    private FrameLayout loadLayout;
    private List<Occurrence> occurrenceList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_maps);

        loadLayout = (FrameLayout)this.findViewById(R.id.loadLayout);
        myWebView = (WebView) this.findViewById(R.id.myWebView);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("file:///android_asset/maps.html");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            myWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
            myWebView.addJavascriptInterface(new JavaScriptHandler(this), "MyHandler");
        }
        new NearbyTask().execute();
    }

    public void carregaPontosServico() {
        Gson gson = new Gson();
        String json = gson.toJson(occurrenceList);
        myWebView
                .loadUrl("javascript:window.MyHandler.setResult( carregarPontosDoServico("
                        + json + "))");
    }

    class NearbyTask extends AsyncTask<Void, Void, String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            loadLayout.setVisibility(View.VISIBLE);
        }

        @Override
        protected String doInBackground(Void... params) {
            HttpClient httpClient = new DefaultHttpClient();
            HttpContext localContext = new BasicHttpContext();
            HttpGet httpGet = new HttpGet("https://dl.dropboxusercontent.com/u/201200/liga/nearby.js");
            String text = null;
            try {
                HttpResponse response = httpClient.execute(httpGet, localContext);
                HttpEntity entity = response.getEntity();
                text = getASCIIContentFromEntity(entity);

                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                occurrenceList = gson.fromJson(text, new TypeToken<List<Occurrence>>(){}.getType());

            } catch (Exception e) {
                return e.getLocalizedMessage();
            }
            return text;
        }

        @Override
        protected void onPostExecute(String results) {
            if (results!=null) {
                carregaPontosServico();
                loadLayout.setVisibility(View.GONE);
            } else {
            }
        }
    }

    protected String getASCIIContentFromEntity(HttpEntity entity) throws IllegalStateException, IOException {
        InputStream in = entity.getContent();
        StringBuffer out = new StringBuffer();
        int n = 1;
        while (n>0) {
            byte[] b = new byte[4096];
            n =  in.read(b);
            if (n>0) out.append(new String(b, 0, n));
        }
        return out.toString();
    }
}