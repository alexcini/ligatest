package br.com.liga.ligatest;

import android.content.Intent;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class JavaScriptHandler {
	GoogleMapsActivity parentActivity;

    public JavaScriptHandler(GoogleMapsActivity activity)  {
        parentActivity = activity;
    }

    @JavascriptInterface
    public void openActivity(String object){
        Intent intent = new Intent(parentActivity, DetailGoogleMapsActivity.class);
        parentActivity.startActivity(intent);
    }
}
