package com.example.recyclerview;

public class ContactModel {

    int image;
    String name;
    String number;

    public ContactModel(int image,String name,String number) {
        this.image = image;
        this.name = name;
        this.number = number;
    }

        public ContactModel (String name,String number){
        this.name=name;
        this.number=number;

    }

}
