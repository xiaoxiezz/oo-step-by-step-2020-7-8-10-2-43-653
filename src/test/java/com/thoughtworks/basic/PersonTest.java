package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void should_return_string_name_and_age_when_give_person_info() {
        //given
        Person person = new Person("Tom",21);

        //when
        String result = person.introduce();

        //then
        assertEquals(result,"My name is Tom. I am 21 years old.");
    }

    @Test
    public void should_return_string_name_and_age_and_job_when_give_teacher_info() {
        //given
        Teacher teacher = new Teacher("Matt",30);
        teacher.setJob("Teacher");

        //when
        String result = teacher.introduce();

        //then
        assertEquals(result,"My name is Matt. I am 30 years old. I am a Teacher.");
    }
}
