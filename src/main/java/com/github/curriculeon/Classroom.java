package com.github.curriculeon;

import java.util.List;

public class Classroom {
    Students STUDENTS;
    Instructors INSTRUCTORS;

    public void hostLecture(Teacher teacher, Double numberOfHours) {
        teacher.lecture((Learner[]) STUDENTS.toArray(), numberOfHours);
    }

    public void hostLecture(long id, Double numberOfHours) {
        Teacher instructor = (Teacher) INSTRUCTORS.findById(id);
        instructor.lecture((Learner[]) STUDENTS.toArray(), numberOfHours);

    }

    public List<Double> getStudyMap() {
        return null;
    }
}
