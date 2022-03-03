package com.geektrust.backend.services;

import com.geektrust.backend.entities.BorewellWater;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@DisplayName("Borewellwaterservice Test")
@ExtendWith(MockitoExtension.class)

public class BorewellwaterserviceTest {


    @InjectMocks
    private Borewellwaterservice borewellwaterservice;

    @Test
    @DisplayName("borewell water service should return correct cost")
    public void borewellwaterservice_ShouldReturnCorrectCost()
    {
        BorewellWater borewellwater = new BorewellWater(2);
        String expected = "90";
        String actual = borewellwaterservice.borewellcost(borewellwater);

        Assertions.assertEquals(expected, actual);
    }
}