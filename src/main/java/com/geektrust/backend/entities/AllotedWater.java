package com.geektrust.backend.entities;

public class AllotedWater {

    private CorporationWater corporationWater;
    private BorewellWater borewellWater;
    private Apartment apartment;
    public AllotedWater(Apartment apartment,CorporationWater corporationWater,BorewellWater borewellWater)
    {
        this.apartment = apartment;
        this.corporationWater = corporationWater;
        this.borewellWater = borewellWater;
    }
    public Apartment getapartment()
    {
        return apartment;
    }
    public CorporationWater getcorporationwater()
    {
        return corporationWater;
    }
    public BorewellWater getborewellwater()
    {
        return borewellWater;
    }



    
}