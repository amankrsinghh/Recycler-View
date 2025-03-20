package com.example.recyclerview;

public class contact_model {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    String name, number;
    int img;

    public contact_model(String name, String number, int img) {
        this.name = name;
        this.number = number;
        this.img = img;
    }
}
