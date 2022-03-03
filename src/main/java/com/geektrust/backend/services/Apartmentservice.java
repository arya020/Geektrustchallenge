package com.geektrust.backend.services;

import com.geektrust.backend.entities.Apartment;
import com.geektrust.backend.exceptions.IncorrectBHKexception;

public class Apartmentservice {

    private Apartment apartment;

	public Apartment create(String BHK){
 
        if (BHK.equals("2")){

            apartment = new Apartment(BHK,"3");
        }
        else if(BHK.equals("3"))
        {
            apartment = new Apartment(BHK,"5");
        }
        else
        {
            throw new IncorrectBHKexception("BHK should be 2 or 3");
        }
        return apartment;
    }
    
    public Apartment addguests(String number){

        int updated = Integer.parseInt(apartment.getguests())+Integer.parseInt(number);
        apartment.updateguests(updated);
        return apartment;
    }

    public int getguest(Apartment apartment){
        
        return Integer.parseInt(apartment.getguests());
    }

    public Apartment getapartment(){
        return apartment;
    }

}