package com.swampus.excercise.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class Task6DeveloperTest {
    @Test
    public void testTask6() {
        try {
            Task6Developer newInstance = (Task6Developer) Class.forName(Task6Developer.class.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            fail("CAN NOT EXTEND Task6Developer CLASS");
        }

    }
}