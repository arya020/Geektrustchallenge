package com.geektrust.backend.commands;

import java.util.List;

import com.geektrust.backend.services.Allotwaterservice;
import com.geektrust.backend.services.Apartmentservice;

public class AllotWaterCommand implements ICommand {

    private final Allotwaterservice allotwaterservice;
    private final Apartmentservice apartmentservice;

    public AllotWaterCommand(Allotwaterservice allotwaterservice,Apartmentservice apartmentservice) {
        this.allotwaterservice = allotwaterservice;
        this.apartmentservice = apartmentservice;
    }

    @Override
    public void execute(List<String> tokens){
        
        allotwaterservice.allot(tokens.get(1),tokens.get(2));
    }

}