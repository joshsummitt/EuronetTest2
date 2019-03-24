package com.company;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Person a = new Person("Bob Smith", "453 Quota Road, AR-72056", "Teacher");
        Person b = new Person("Joe Hender", "567 Sample Road, AR-72056", "Programmer");
        Person c = new Person("David Ron", "333 Sample1 Road, AR-72056", "Contractor");
        Person d = new Person("Bob Smith", "567 Sample Road, AR-72056", "Programmer");

        ArrayList<Person> people = new ArrayList<>();
        people.add(a);
        people.add(b);
        people.add(c);
        people.add(d);

        for(Person person:people)
        {
            if(person.getProfession().equals("Programmer"))
            {
                System.out.println("Name:   " + person.getName());
                System.out.println("Address:   " + person.getAddress());
                System.out.println("Profession:   " + person.getProfession() + "\n");
            }
        }
    }
}
