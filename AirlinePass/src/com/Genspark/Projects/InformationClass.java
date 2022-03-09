package com.Genspark.Projects;

public class InformationClass {
    private String name, email, phoneNumber,gender,age;


    InformationClass(String name, String email, String phoneNumber, String gender, String age){
        setName(name);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setGender(gender);
        setAge(age);


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
        email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        age = age;
    }
}

