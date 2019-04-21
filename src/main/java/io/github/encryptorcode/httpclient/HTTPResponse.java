package io.github.encryptorcode.httpclient;

import okhttp3.ResponseBody;

import java.io.IOException;

public class HTTPResponse {
    private int responseCode;
    private String responseMessage;
    private String body;

    HTTPResponse(int responseCode, String responseMessage, ResponseBody body) throws IOException {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        if(body != null) {
            this.body = body.string();
        }
    }

    public int getResponseCode() {
        return responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public String getData(){
        return this.body;
    }
}
