package com.geektrust.backend.commands;

import static org.mockito.ArgumentMatchers.anyList;

import java.util.ArrayList;

import com.geektrust.backend.exceptions.NoSuchCommandException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@DisplayName("CommandInvokerTest")
@ExtendWith(MockitoExtension.class)
public class CommandInvokerTest {

    private CommandInvoker commandinvoker;

    @Mock
    AllotWaterCommand allotWaterCommand;

    @Mock
    BillCommand billCommand;

    @Mock
    AddGuestsCommand addGuestsCommand;

    @BeforeEach
    void setup()
    {
        commandinvoker = new CommandInvoker();
        commandinvoker.register("ALLOT_WATER", allotWaterCommand);
        commandinvoker.register("ADD_GUESTS", addGuestsCommand);
        commandinvoker.register("BILL", billCommand);


    }

    @Test
    @DisplayName("given command should be executed")
    public void command_ShouldBeExecuted()
    {
        commandinvoker.executeCommand("ALLOT_WATER", anyList());
        commandinvoker.executeCommand("BILL", anyList());
        commandinvoker.executeCommand("ADD_GUESTS", anyList());


    }

    @Test
    @DisplayName("Should throw exception for incorrect commands")
    public void incorrectcommand_ShouldThrowException()
    {
        Assertions.assertThrows(NoSuchCommandException.class,()->commandinvoker.executeCommand("incorrectcommand", new ArrayList<>()));
    }
    
}