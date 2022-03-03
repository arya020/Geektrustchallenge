package com.geektrust.backend;

import java.io.*;

import java.util.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();


    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    
    @Test
    void runTest1(){
     
        List<String> arguments= new ArrayList<>(List.of("input1.txt"));

        String expectedOutput="3900 10334";

        App.run(arguments);
        Assertions.assertEquals(expectedOutput,outputStreamCaptor.toString().trim());
    
	}
}