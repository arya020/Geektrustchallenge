package com.geektrust.backend.commands;

import java.util.List;

import com.geektrust.backend.entities.Apartment;
import com.geektrust.backend.services.Apartmentservice;

public class AddGuestsCommand implements ICommand {

    private final Apartmentservice apartmentservice;

    public AddGuestsCommand(Apartmentservice apartmentservice){
        this.apartmentservice = apartmentservice;
    }

    @Override
    public void execute(List<String> tokens){
        
        apartmentservice.addguests(tokens.get(1));
    }
    
}