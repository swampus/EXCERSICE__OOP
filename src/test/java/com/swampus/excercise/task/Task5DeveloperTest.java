package com.swampus.excercise.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5DeveloperTest {

    @Test
    public void testClassExtended() {
        assertEquals("MyJavaClass", Task5Developer.class.getSuperclass().getSimpleName());
    }

}