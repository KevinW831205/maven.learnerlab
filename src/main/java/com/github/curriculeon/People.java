package com.github.curriculeon;

import java.util.Iterator;
import java.util.List;

public class People implements Iterable{
    List<Person> personList;

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        for(Person p : personList){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public boolean contains(Person person){
        return personList.contains(person);
    }

    public void remove(long id){
        for(Person p: personList){
            if(p.getId() == id){
                personList.remove(p);
            }
        }
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void removeAll(){
        personList.removeAll(personList);
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[0]);
    }


    @Override
    public Iterator iterator() {
        return null;
    }
}
