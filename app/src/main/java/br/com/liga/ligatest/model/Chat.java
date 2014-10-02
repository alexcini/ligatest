package br.com.liga.ligatest.model;

/**
 * Created by heiderlopes on 02/10/14.
 */
public class Chat {
    private int count;
    private int userCommented;
    private int muted;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserCommented() {
        return userCommented;
    }

    public void setUserCommented(int userCommented) {
        this.userCommented = userCommented;
    }

    public int getMuted() {
        return muted;
    }

    public void setMuted(int muted) {
        this.muted = muted;
    }
}
