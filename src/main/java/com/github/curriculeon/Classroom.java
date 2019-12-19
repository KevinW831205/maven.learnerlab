package com.github.curriculeon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classroom {
    final static Classroom INSTANCE = new Classroom();
    final private Students STUDENTS = Students.getINSTANCE();
    final private Instructors INSTRUCTORS = Instructors.getINSTANCE();

    private Classroom() {
    }

    public void hostLecture(Teacher teacher, Double numberOfHours) {
        if (INSTRUCTORS.contains((Person) teacher)){
            teacher.lecture((Learner[]) STUDENTS.toArray(), numberOfHours);
        }
    }

    public void hostLecture(long id, Double numberOfHours) {
        Teacher instructor = (Teacher) INSTRUCTORS.findById(id);
        if(instructor != null){
            instructor.lecture((Learner[]) STUDENTS.toArray(), numberOfHours);
        }
    }

    public List<Double> getStudyMap() {
        List<Double> studyHours = new ArrayList<>();
        for (Student student : (Student[]) STUDENTS.toArray()) {
            studyHours.add(student.getTotalStudyTime());
        }
        return studyHours;
    }

    public static Classroom getINSTANCE() {
        return INSTANCE;
    }
}
