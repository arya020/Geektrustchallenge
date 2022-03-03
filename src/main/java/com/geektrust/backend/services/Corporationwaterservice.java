package com.geektrust.backend.services;

import com.geektrust.backend.entities.CorporationWater;

public class Corporationwaterservice {

    public CorporationWater create(float litres)
    {
        CorporationWater corporationWater = new CorporationWater(litres);
        return corporationWater;
    }
    public String corporationwatercost(CorporationWater corporationWater)
    {
        float litres = corporationWater.getlitres();
        float rate = Float.parseFloat(corporationWater.getrate());
        float cost = litres * rate * 30;
        return Integer.toString((int)Math.ceil(cost));
    }
    
}