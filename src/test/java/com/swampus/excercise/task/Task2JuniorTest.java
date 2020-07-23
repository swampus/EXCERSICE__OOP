package com.swampus.excercise.task;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Task2JuniorTest {

    @Test
    public void createTParserOfContinue() {
        assertNotNull(new Task2Junior().createTParserOfContinue());
    }
}