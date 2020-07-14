package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void should_return_string_name_and_age_nogiven() {
        //given
        Person person = new Person();

        //when
        String result = person.introduce();

        //then
        assertEquals(result,"My name is Tom. I am 21 years old.");
    }

    @Test
    public void should_return_string_name_and_age_and_job_nogiven() {
        //given
        Teacher teacher = new Teacher();
        //when
        String result = teacher.introduce();

        //then
        assertEquals(result,"My name is Matt. I am 30 years old. I am a Teacher.");
    }
}
