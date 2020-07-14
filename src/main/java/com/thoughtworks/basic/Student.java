package com.thoughtworks.basic;

public class Student extends Person {
    public Number classNumber;

    public Number getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(Number classNumber) {
        this.classNumber = classNumber;
}

    public String introduce() {
        Student student = new Student();
//        student.setName("Tom");
        student.setClassNumber(2);
        return "My name is "+student.getName()+". I am "+student.getAge()+" years old. I am a Student of Class "+student.getClassNumber()+".";
    }
}
