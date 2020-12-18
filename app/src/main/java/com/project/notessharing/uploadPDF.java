package com.project.notessharing;

public class uploadPDF {

    public String message, url;

    public uploadPDF() {

    }

    public uploadPDF(String message, String url) {
        this.message = message;
        this.url = url;
    }

    public String getMessage() {
        return message;
    }

    public String getUrl() {
        return url;
    }

}
