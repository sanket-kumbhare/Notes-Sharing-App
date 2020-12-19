package com.project.notessharing;

public class uploadPDF {

    public String name, message, url;


    public  uploadPDF() {
    }

    public uploadPDF(String name, String message, String url) {
        this.name = name;
        this.message = message;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getUrl() {
        return url;
    }
}
