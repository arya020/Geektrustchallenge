package com.geektrust.backend.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@DisplayName("Corporationwaterservice Test")
@ExtendWith(MockitoExtension.class)

public class TankerwaterserviceTest {


    @InjectMocks
    private Tankerwaterservice tankerwaterservice;

    @Test
    @DisplayName("Tanker water service should return correct cost")
    public void tankerwaterservice_ShouldReturnCorrectCost()
    {
        String expected = "8500";
        String actual = tankerwaterservice.getcost(2400);

        Assertions.assertEquals(expected, actual);
    
        expected = "1000";
        actual = tankerwaterservice.getcost(500);

        Assertions.assertEquals(expected, actual);
    }
}