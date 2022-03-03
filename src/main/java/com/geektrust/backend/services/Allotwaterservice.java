package com.geektrust.backend.services;

import com.geektrust.backend.entities.AllotedWater;
import com.geektrust.backend.entities.Apartment;
import com.geektrust.backend.entities.BorewellWater;
import com.geektrust.backend.entities.CorporationWater;

public class Allotwaterservice {

    Apartmentservice apartmentservice;
	public Allotwaterservice(Apartmentservice apartmentservice) {
        this.apartmentservice = apartmentservice;
	}
    AllotedWater allotedWater;

	public void allot(String BHK, String ratios) {

        Apartment apartment = apartmentservice.create(BHK);

        String[] ratio = ratios.split(":");
        Corporationwaterservice corporationwaterservice = new Corporationwaterservice();
        Borewellwaterservice borewellwaterservice = new Borewellwaterservice();
        float litres = Integer.parseInt(apartment.getno_of_people())*10;
        float ratioc = Float.parseFloat(ratio[0]);
        float ratiob = Float.parseFloat(ratio[1]);

        BorewellWater borewellwater = borewellwaterservice.create(litres*ratiob/(ratioc+ratiob));
        CorporationWater corporationwater = corporationwaterservice.create(litres*ratioc/(ratiob+ratioc));
        allotedWater = new AllotedWater(apartment, corporationwater, borewellwater);

	}

	public AllotedWater getallotedwater() {
		return allotedWater;
	}

    
}