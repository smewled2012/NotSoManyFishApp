package com.seme.org;

import java.util.ArrayList;

public class Person {
    public String name;
    public ArrayList<Person> noDate;
    private ArrayList<Integer> dateCount;

    public Person(String name) {
        dateCount = new ArrayList<>();
        this.name = name;
    }

    public Person(ArrayList<Person> noDate) {
        this.noDate = noDate;
    }

    public Person() {

        noDate= new ArrayList<>();
        dateCount = new ArrayList<>();
    }

    public ArrayList<Person> getNoDate() {
        return noDate;
    }

    public void setNoDate(ArrayList<Person> noDate) {
        this.noDate = noDate;
    }

    public ArrayList<Integer> getDateCount() {
        return dateCount;
    }

    public void setDateCount(ArrayList<Integer> dateCount) {
        this.dateCount = dateCount;
    }

    public String getName() {
        return name;
    }

    public void setPerson(String name) {
        this.name = name;
    }
}
