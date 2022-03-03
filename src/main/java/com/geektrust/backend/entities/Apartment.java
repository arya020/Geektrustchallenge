package com.geektrust.backend.entities;

public class Apartment  {
    
    private String BHK;
    private String no_of_people;
    private String guests ="0";
    
    public Apartment(String BHK,String no_of_people)
    {
        this.BHK = BHK;
        this.no_of_people = no_of_people;
    }
    public String getBHK()
    {
        return BHK;
    }
    public String getno_of_people()
    {
        return no_of_people;
    }
    public String getguests()
    {
        return guests;
    }
    public String updateguests(int number)
    {
        guests = Integer.toString(number);
        return guests;
    }    


}