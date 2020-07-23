package com.swampus.excercise.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4DeveloperTest {

    @Test
    public void testInterfaceImplemented() {
        assertEquals(1, Task4Developer.class.getInterfaces().length);
        assertEquals("MyJavaInterface", Task4Developer.class.getInterfaces()[0].getSimpleName());
    }
}