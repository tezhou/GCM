package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyCS76K_ygP_Se8kvBanF0aXbLXg9qyDGF8";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId(" APA91bHG1FYVbG4SYlen98t4WVUHw7cU5gqlmvxUzscEOi9HVdhQPagKI7EUoNF1TYw1vgiEuevLcPAMXmL8iPyKEd0IxGbW_ce_ddeIZ4faXq1RGNbm25Oq6rVUayx5t93OxSDRgMCm");

        c.createData("Working!!", "Test message");

        return c;
    }
}

