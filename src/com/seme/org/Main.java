package com.seme.org;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        Set<Person> noDates = new HashSet<>();



        // create a list of 6 people
       // List<String>= new ArrayList<>({"LISa"}{}"")
        //List<String> peoples = Arrays.asList("Lisa", "Sara", "Simon","Mark","Michael","Monica");


        // create 6 persons
        Person person = new Person("Lisa");
        persons.add(person);
        person = new Person("Monica");
        persons.add(person);
        person = new Person("Silvia");
        persons.add(person);
        person = new Person("David");
        persons.add(person);
        person = new Person("Markos");
        persons.add(person);
        person = new Person("Alton");
        persons.add(person);

        // checking the size of the persons

        System.out.println("the size of the persons "+ persons.size());
        // choose randomly one person

        boolean noDate = false;

        Random rand = new Random();
        Person personal =new Person();

        for(int i=0;i<10;i++) {

            Person person1 = persons.get(rand.nextInt(persons.size()));

            Person person2 = persons.get(rand.nextInt(persons.size()));

            if(personal.getNoDate().contains(person1)&&personal.getNoDate().contains(person2)){
                System.out.println("  ********Ups You can't Date ! Rememeber You Broke Up ********");
            }

            if (person1.getName().equalsIgnoreCase(person2.getName())) {
                System.out.println(person1.getName() + "****** wow ! you are Free sATURDAY nIGHT !*******");
            } else {
                System.out.println("Date: " + i++);
                dateGoingOn(person1, person2,rand);


               // displayDate(person1,person2);
                countDates(person1,person2,persons);

               // rand.nextBoolean();
                if(rand.nextBoolean()){
                    System.out.println("Broke up!!");
                    personal.getNoDate().add(person1);
                    personal.getNoDate().add(person2);
                }

                System.out.println("\n");

            }
        }

        displayDate(persons);

    }


    private static void displayDate(List<Person> persons) {
        System.out.println(" see the size of the dates for each persons ");
        for(Person eachPerson: persons) {
            System.out.println(eachPerson.getName() +" go a date out "+ eachPerson.getDateCount().size());

        }
    }


    private static void dateGoingOn(Person person1, Person person2,Random rand) {

        ArrayList<Person> listofpersons= new ArrayList<>();

        String [] activity ={"played chess with","tipped over a glass during a date with","went to dinner with ","saw a movie with","went to a meetup with ", "visited"};

        System.out.println(person1.getName()+ " asked "+ person2.getName()+" out, and "+person2.getName()+" Accepted");
       // String activity1 =

        int index,index1,index2;
        do {
            index = rand.nextInt(activity.length);
            //String activity1 = activity[index];
            index1 = rand.nextInt(activity.length);
            index2 = rand.nextInt(activity.length);
        }while(index==index1||index==index2||index==index2);
       // System.out.println(proper_noun[index]);
       // int count =0;
       //  {

            System.out.println(person1.getName() + " " + activity[index] + " " + person2.getName());
            System.out.println(person1.getName() + " " + activity[index1] + " " + person2.getName());
            System.out.println(person1.getName() + " " + activity[index2] + " " + person2.getName());
           // System.out.println("\n");
            //count++;
      //  }
    }

    private static void countDates(Person person1, Person person2,List<Person> listofpersons) {

        int count=0;

        for(Person eachperson:listofpersons){
            if(person1.getName().equals(eachperson.getName())){
                eachperson.getDateCount().add(count++);
            }
            if(person2.getName().equals(eachperson.getName())){
                    eachperson.getDateCount().add(count++);
            }
        }

        }

}
