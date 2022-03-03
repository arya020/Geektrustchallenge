package com.geektrust.backend.services;

import com.geektrust.backend.entities.Apartment;
import com.geektrust.backend.entities.CorporationWater;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;

@DisplayName("Corporationwaterservice Test")
@ExtendWith(MockitoExtension.class)

public class CorporationwaterserviceTest {


    @InjectMocks
    private Corporationwaterservice corporationwaterservice;

    @Test
    @DisplayName("corporation water service should return correct cost")
    public void corporationwaterservice_ShouldReturnCorrectCost()
    {
        CorporationWater corporationWater = new CorporationWater(5);
        String expected = "150";
        String actual = corporationwaterservice.corporationwatercost(corporationWater);

        Assertions.assertEquals(expected, actual);
    }
}