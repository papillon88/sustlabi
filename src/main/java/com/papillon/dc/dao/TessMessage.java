package com.papillon.dc.dao;

import java.util.Date;

/**
 * Created by papillon on 5/19/2017.
 */
public class TessMessage {

    private String message;
    private String date;

    public void setMessage(String message) {
        this.message = message;
    }

    //required for extraction of 'message' from param list in controller
    public String getMessage() {
        return message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TessMessage{" +
                "message='" + message + '\'' +
                ", date=" + date +
                '}';
    }
}
