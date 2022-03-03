package com.geektrust.backend.entities;

public class Bill {
    
    private String total_water;
    private String total_cost;
    public Bill(String total_water,String total_cost)
    {
        this.total_water = total_water;
        this.total_cost = total_cost;
    }
    public String gettotal_water()
    {
        return total_water;
    }
    public String gettotal_cost()
    {
        return total_cost;
    }

    public String toString()
    {
        return total_water+" "+total_cost;
    }
    
}