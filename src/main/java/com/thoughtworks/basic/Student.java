package com.thoughtworks.basic;

public class Student extends Person {
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

    public String introduce() {
        Student student = new Student();
        student.setName("Tom");
        student.setAge(21);
        student.setClassNumber(2);
        String res = "My name is "
                + student.getName()
                + ". I am "+student.getAge()
                + " years old. I am a Student of Class "
                + student.getClassNumber()+".";
        return res;
    }
}
