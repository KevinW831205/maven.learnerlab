package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract public class People implements Iterable<Person>{
    List<Person> personList;

    public People(List<Person> personList) {
        this.personList = personList;
    }

    public People() {
        this.personList = new ArrayList<>();
    }

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
//        for(Person p: personList){
//            if(p.getId() == id){
//                personList.remove(p);
//            }
//        }

        for(Iterator<Person> iterator = this.iterator(); iterator.hasNext();){
            Person p = iterator.next();
            if(p.getId() == id){
                iterator.remove();
                return;
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
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
