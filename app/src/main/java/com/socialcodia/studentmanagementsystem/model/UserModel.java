package com.socialcodia.studentmanagementsystem.model;

public class UserModel {
    public String name, email;
    int id;

    public UserModel(int anInt, String string, String sharedPreferencesString) {
    }

    public UserModel(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}