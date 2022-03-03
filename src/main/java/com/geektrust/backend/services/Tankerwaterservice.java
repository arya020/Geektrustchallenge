package com.geektrust.backend.services;

public class Tankerwaterservice {

    int cost;
    public String getcost(int litre)
    {
        int remaining = litre;
        cost=0;
        remaining = slab1(remaining);
        remaining = slab2(remaining);
        remaining = slab3(remaining);
        remaining = slab4(remaining);

        return Integer.toString(cost);   
    }

    public int slab1(int remaining)
    {
        if(remaining<=0)
        {
            return remaining;
        }
        if(remaining>=500)
        {
            remaining -=500;
            cost = cost + 2*500;
        }
        else if(remaining<500)
        {
        cost = cost + 2*remaining;
        remaining=0;
        }
        return remaining;
    }

    public int slab2(int remaining)
    {
        if(remaining<=0)
        {
            return remaining;
        }
        if(remaining>=1000)
        {
            remaining -=1000;
            cost = cost + 3*1000;
        }
        else if(remaining<1000 && remaining!=0)
        {
        cost = cost + 3*remaining;
        remaining=0;
        }
        return remaining;
    }

    public int slab3(int remaining)
    {
        if(remaining<=0)
        {
            return remaining;
        }
        if(remaining>=1500)
        {
            cost = cost + 5*1500;
            remaining -=1500;
        }
        else if(remaining<1500 && remaining!=0)
       {
        cost = cost + 5*remaining;
        remaining=0;
       }
        return remaining;
    }
    public int slab4(int remaining)
    {
        if(remaining<=0)
        {
            return remaining;
        }
        if(remaining>=3000)
        {
            cost = cost + 8*3000;
        }
        else if(remaining<3000 && remaining!=0)
        {
        cost = cost + 8*remaining;
        remaining=0;
        }
        return remaining;
    }
}