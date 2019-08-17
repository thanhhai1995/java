package com.example.demoretrofit;

public class Data {
    int id;
    String avatar_url;


    public Data(int id, String avatar_url) {
        this.id = id;
        this.avatar_url = avatar_url;

    }

    public int getId() {
        return id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

}
