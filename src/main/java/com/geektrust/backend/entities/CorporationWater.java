package com.geektrust.backend.entities;

public class CorporationWater {
    
    private final String RateperLitre = "1";
    private float litres;

    public CorporationWater(float litres){
        this.litres = litres;
    }
    
	public String getrate(){
        return RateperLitre;
    }

    public float getlitres(){
        return litres;
    }
}