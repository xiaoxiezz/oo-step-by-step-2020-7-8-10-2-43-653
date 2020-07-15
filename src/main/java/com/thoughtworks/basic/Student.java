package com.thoughtworks.basic;

public class Student extends Person {

    private Klass Klass;
    private com.thoughtworks.basic.Klass klass;

    public Student(String name, int age) {
        super(name, age);
    }
    public int classNumber;

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
}

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
//        Student student = new Student();
//        student.setClassNumber(2);
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student of Class "+getClassNumber()+".";
    }
}
