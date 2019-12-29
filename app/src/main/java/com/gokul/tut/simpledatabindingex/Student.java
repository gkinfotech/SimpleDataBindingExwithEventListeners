package com.gokul.tut.simpledatabindingex;

public class Student {

    private String Name;
    private String Email;

    public Student() {
    }

    public Student(String name, String email) {
        Name = name;
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
