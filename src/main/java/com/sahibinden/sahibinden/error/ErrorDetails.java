package com.sahibinden.sahibinden.error;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.xml.crypto.Data;
import java.util.Date;

public class ErrorDetails {
    private String message;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private Date tarih;
    private String  url;
    public ErrorDetails(){
        this.tarih=new Date();
    }

    public ErrorDetails(String message, String url) {
        this();
        this.message = message;

        this.url = url;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTarih() {
        return tarih;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
