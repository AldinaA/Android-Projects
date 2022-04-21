package com.example.passobjecttosecondactivity;

public class Member implements java.io.Serializable{

    String fullName;
    String gender;
    String currentWeight;
    String goalWeight;
    String height;
    String age;
    String phone;
    String adress;
    Boolean terms;

    public Member(String fullName, String gender, String currentWeight, String goalWeight, String height, String age, String phone, String adress, Boolean terms) {
        this.fullName = fullName;
        this.gender = gender;
        this.currentWeight = currentWeight;
        this.goalWeight = goalWeight;
        this.height = height;
        this.age = age;
        this.phone = phone;
        this.adress = adress;
        this.terms = terms;
    }
}
