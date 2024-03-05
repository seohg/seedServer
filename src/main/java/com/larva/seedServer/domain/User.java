package com.larva.seedServer.domain;


public class User {

    private String displayName;

    public User() {
    }

    public User(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}