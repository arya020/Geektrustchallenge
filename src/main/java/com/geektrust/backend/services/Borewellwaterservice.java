package com.geektrust.backend.services;

import com.geektrust.backend.entities.BorewellWater;

public class Borewellwaterservice {

    public BorewellWater create(float litres)
    {
        BorewellWater borewellWater = new BorewellWater(litres);
        return borewellWater;
    }
    public String borewellcost(BorewellWater borewellWater)
    {
        float litres = borewellWater.getlitres();
        float rate = Float.parseFloat(borewellWater.getrate());
        float cost = litres * rate * 30;
        return Integer.toString((int)Math.ceil(cost));
    }
    
}