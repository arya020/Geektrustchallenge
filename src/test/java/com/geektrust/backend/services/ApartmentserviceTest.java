package com.geektrust.backend.services;

import static org.mockito.Mockito.doThrow;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import com.geektrust.backend.entities.Apartment;
import com.geektrust.backend.exceptions.IncorrectBHKexception;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;

@DisplayName("Apartmentservice Test")
@ExtendWith(MockitoExtension.class)

public class ApartmentserviceTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @InjectMocks
    private Apartmentservice apartmentservice;

    @Test
    @DisplayName("create method should create apartment")
    public void create_ShouldReturnApartment()
    {
        
        Apartment expectedapartment = new Apartment("2","3");
        Apartment actualapartment = apartmentservice.create("2");

        Assertions.assertEquals(expectedapartment.getno_of_people(),actualapartment.getno_of_people());
    }

    @Test
    @DisplayName("create method should throw incorrectBHKexception")
    public void create_ShouldThrowIncorrectBHKexception()
    {
        Assertions.assertThrows(IncorrectBHKexception.class,()->apartmentservice.create("random_integer"));
    }

    @Test
    @DisplayName("addguests should add the no_of_people given")
    public void addguests_ShouldaddNo_of_people()
    {
        Apartment apartment = apartmentservice.create("2");
        apartmentservice.addguests("5");
        String expected = "5";
        String actual = apartment.getguests();
        Assertions.assertEquals(expected,actual);

    }
    
    
}