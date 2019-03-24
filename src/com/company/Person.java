package com.company;

public class Person
{
    private String name;
    private String address;
    private String profession;

    public Person(String name, String address, String profession)
    {
        this.name = name;
        this.address = address;
        this.profession = profession;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public String getProfession()
    {
        return profession;
    }

    public void setProfession(String profession)
    {
        this.profession = profession;
    }
}
