package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class KlassTest {
    @Test
    public void should_return_true_when_verify_student_class_is_subclass_of_person_class(){
//        given
        Class studentClass = Student.class;
        Class teacherClass = Teacher.class;

//        when
        boolean verifyResult = studentClass.isAssignableFrom(teacherClass);
        // then
        Assert.assertEquals(true, verifyResult);
    }
}
