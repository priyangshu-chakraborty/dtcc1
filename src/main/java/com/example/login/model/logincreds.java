package com.example.login.model;

public class logincreds {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public logincreds(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
