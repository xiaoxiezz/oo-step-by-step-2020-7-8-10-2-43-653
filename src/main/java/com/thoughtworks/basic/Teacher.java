package com.thoughtworks.basic;

public class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher.";
    }
}
