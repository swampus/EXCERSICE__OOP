package com.swampus.excercise.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task8SeniorTest {

    @Test
    public void fly() {
        assertEquals("fly", new Task8Senior().fly());
    }
}