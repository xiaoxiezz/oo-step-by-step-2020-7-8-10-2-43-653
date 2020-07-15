package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void should_return_string_name_and_age_and_class_when_give_student_info() {
        //given
        Student student = new Student("Tom",21);
        student.setClassNumber(2);
        //when
        String result = student.introduce();

        //then
        assertEquals(result,"My name is Tom. I am 21 years old. I am a Student of Class 2.");
    }
}
