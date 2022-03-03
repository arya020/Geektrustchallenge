package com.geektrust.backend.appConfig;

import com.geektrust.backend.commands.AddGuestsCommand;
import com.geektrust.backend.commands.AllotWaterCommand;
import com.geektrust.backend.commands.BillCommand;
import com.geektrust.backend.commands.CommandInvoker;
import com.geektrust.backend.services.*;

public class ApplicationConfig {

    private final Apartmentservice apartmentservice = new Apartmentservice();
    private final Allotwaterservice allotwaterservice = new Allotwaterservice(apartmentservice);
    private final Corporationwaterservice corporationwaterservice = new Corporationwaterservice();
    private final Borewellwaterservice borewellwaterservice = new Borewellwaterservice();
    private final Tankerwaterservice tankerwaterservice = new Tankerwaterservice();
    private final Billservice billservice = new Billservice(corporationwaterservice,borewellwaterservice,tankerwaterservice,apartmentservice,allotwaterservice);
    
    private final AddGuestsCommand addGuestsCommand = new AddGuestsCommand(apartmentservice);
    private final AllotWaterCommand allotWaterCommand = new AllotWaterCommand(allotwaterservice,apartmentservice);
    private final BillCommand billCommand = new BillCommand(billservice);

    private final CommandInvoker commandInvoker = new CommandInvoker();

    public CommandInvoker getCommandInvoker(){
        commandInvoker.register("ALLOT_WATER", allotWaterCommand);
        commandInvoker.register("ADD_GUESTS",addGuestsCommand);
        commandInvoker.register("BILL",billCommand);
    
        return commandInvoker;
    
    }
}