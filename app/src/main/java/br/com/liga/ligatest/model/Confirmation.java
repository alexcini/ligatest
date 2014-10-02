package br.com.liga.ligatest.model;

/**
 * Created by heiderlopes on 02/10/14.
 */
public class Confirmation {
    private int error;
    private int count;
    private int userConfirmed;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserConfirmed() {
        return userConfirmed;
    }

    public void setUserConfirmed(int userConfirmed) {
        this.userConfirmed = userConfirmed;
    }
}
