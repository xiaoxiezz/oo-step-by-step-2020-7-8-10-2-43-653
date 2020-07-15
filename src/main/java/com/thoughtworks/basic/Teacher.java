package com.thoughtworks.basic;

public class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String job;

    @Override
    public String introduce() {
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a "+getJob()+".";
    }
}
