package com.papillon.dc.dao;

/**
 * Created by papillon on 5/19/2017.
 */
public class TessMessage {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "TessMessage{" +
                "message='" + message + '\'' +
                '}';
    }
}
