package com.geektrust.backend.commands;

import java.util.List;
import com.geektrust.backend.services.Billservice;

public class BillCommand implements ICommand {

    private final Billservice billservice;
    public BillCommand(Billservice billservice)
    {
        this.billservice = billservice;
    }

    @Override
    public void execute(List<String> tokens) {
       
        System.out.println(billservice.createbill());
    }
  
    
}