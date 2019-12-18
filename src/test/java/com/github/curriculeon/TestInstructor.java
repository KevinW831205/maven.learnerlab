package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {


    @Test
    public void TestImplementation() {
        //Given
        Person instructor = new Instructor((long) 1, "instructor");

        //When
        boolean instanceOfTeacher = instructor instanceof Teacher;

        //Then
        Assert.assertTrue(instanceOfTeacher);
    }

    @Test
    public void TestInheritence() {
        //Given
        Instructor instructor = new Instructor((long) 1, "instructor");

        //When
        boolean instanceofPerson = instructor instanceof Person;

        //Then
        Assert.assertTrue(instanceofPerson);
    }

    public void TestTeach(Double... numberOfHours){
        // given
        Instructor instructor = new Instructor((long) 1, "instructor");
        Student student = new Student((long) 1, "student");

        Double actualHours = 0.0;
        for(Double hr : numberOfHours){
            if(hr>0){
                actualHours += hr;
            }
        }

        //when
        for(Double hr : numberOfHours){
            instructor.teach(student, hr);
        }

        // then

    }



}
