package com.geektrust.backend.entities;

public class BorewellWater {

    private final String RateperLitre = "1.5";
    private float litres;
    
    public BorewellWater(float litres) {
        this.litres = litres;
    }
    
	public String getrate(){
        return RateperLitre;
    }

    public float getlitres(){
        return litres;
    }
    
}