package com.thoughtworks.basic;

public class Person {
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String introduce(){
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }
}
