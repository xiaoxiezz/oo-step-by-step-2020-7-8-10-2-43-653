package com.thoughtworks.basic;

public class Person {
    public String name;
    public Number age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Number getAge() {
        return age;
    }

    public void setAge(Number age) {
        this.age = age;
    }

    public String introduce(){
        Person person = new Person();
        person.setName("Tom");
        person.setAge(21);
        return "My name is "+person.getName()+". I am "+person.getAge()+" years old.";
    }
}
