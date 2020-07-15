package com.thoughtworks.basic;

public class Student extends Person {

    private Klass klass;
    public void changeName(String name) {
        super.setName(name);
        String notice = "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student of Class " + clazz.getNum() + " now.";
        klass.getStudent().forEach(e -> {
            if (!this.equals(e)) {
                e.notice(notice);
            }
        });
        klass.getTeacher().notice(notice);
    }

    public void changeKlass(Klass klass) {
        String notice = "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student of Class " + clazz.getNum() + " now.";
        this.klass.getStudent().remove(this);
        this.klass.getStudent().forEach( e -> {
            e.notice(notice);
        });
        this.klass.getTeacher().notice(notice);
        klass.getStudent().forEach(e -> {
            e.notice(notice);
        });
        klass.getStudent().add(this);
        klass.getTeacher().notice(notice);
    }


    public Student(String name, int age) {
        super(name, age);
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student of Class " + this.klass.getNum() + ".";
    }
}

}
