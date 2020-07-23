package com.swampus.excercise.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task9SeniorTest {

    @Test
    public void checkExtractedMethod() throws NoSuchMethodException {
        assertNotEquals(Object.class, Task9Senior.class.getSuperclass());
        assertNotNull(Task9Senior.class.getSuperclass().getMethod("theMethodOne"));
        assertNotNull(Task9Senior.class.getSuperclass().getMethod("theMethodTwo"));
        try {
            Task9Senior.class.getDeclaredMethod("theMethodOne");
            fail();
        } catch (NoSuchMethodException e) {

        }

        try {
            Task9Senior.class.getDeclaredMethod("theMethodTwo");
            fail();
        } catch (NoSuchMethodException e) {

        }

        assertEquals(11, Task9Senior.class.getMethods().length);


    }
}