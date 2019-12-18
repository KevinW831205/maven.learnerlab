package com.github.curriculeon;

import java.util.List;

public class Students extends People {
    final static Students INSTANCE = new Students();

    private Students(){
        String[] nameArray = "Kevin Nez Sana".split(" ");
        for (Long id = 0L; id < nameArray.length; id++) {
            String name = nameArray[id.intValue()];
            Student student = new Student(id, name);
            super.add(student);
        }
    }
}
