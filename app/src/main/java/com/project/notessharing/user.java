package com.project.notessharing;

public class user {

    public String name, mobile_number, email, password;

    public user () {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public user(String name, String mobile_number, String email, String password) {
        this.name = name;
        this.mobile_number = mobile_number;
        this.email = email;
        this.password = password;
    }
}
