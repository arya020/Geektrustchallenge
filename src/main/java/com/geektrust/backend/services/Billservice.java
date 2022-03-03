package com.geektrust.backend.services;

import com.geektrust.backend.entities.*;

public class Billservice {

    Corporationwaterservice corporationwaterservice;
    Borewellwaterservice borewellwaterservice;
    Tankerwaterservice tankerwaterservice;
    Apartmentservice apartmentservice;
    Allotwaterservice allotwaterservice;
    Bill bill;
    public Billservice(Corporationwaterservice corporationwaterservice,Borewellwaterservice borewellwaterservice,Tankerwaterservice tankerwaterservice,
                        Apartmentservice apartmentservice,Allotwaterservice allotwaterservice)
    {
        this.corporationwaterservice = corporationwaterservice;
        this.borewellwaterservice = borewellwaterservice;
        this.tankerwaterservice = tankerwaterservice;
        this.apartmentservice = apartmentservice;
        this.allotwaterservice = allotwaterservice;
    }


    public String totalconsumption(AllotedWater allotedwater){

        int required = (Integer.parseInt(allotedwater.getapartment().getguests())+ Integer.parseInt(allotedwater.getapartment().getno_of_people()))*10*30;
        return Integer.toString(required);
    }

    public String totalcost(AllotedWater allotedwater){

        String cost1 = borewellwaterservice.borewellcost(allotedwater.getborewellwater());
        String cost2 = corporationwaterservice.corporationwatercost(allotedwater.getcorporationwater());
        String guestcost  = tankerwaterservice.getcost(apartmentservice.getguest(allotedwater.getapartment())*10*30);

        int totalcost = Integer.parseInt(cost1)+Integer.parseInt(cost2)+Integer.parseInt(guestcost);
        return Integer.toString(totalcost);
    }
    
    public Bill createbill()
    {
        AllotedWater allotedwater = allotwaterservice.getallotedwater();
        String total_water_consumed = totalconsumption(allotedwater);
        String total_cost= totalcost(allotedwater);
        bill = new Bill(total_water_consumed,total_cost);
        return bill;
    }
}