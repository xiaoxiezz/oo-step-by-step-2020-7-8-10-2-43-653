package com.thoughtworks.basic;

public class Teacher extends Person {
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String job;

    public String introduce(){
        Teacher teacher = new Teacher();
        teacher.setJob("Teacher");
        teacher.setName("Matt");
        teacher.setAge(30);
        String res = "My name is "
                + teacher.getName()
                + ". I am "+teacher.getAge()
                + " years old. I am a "
                + teacher.getJob()
                + ".";
        return res;
    }
}
