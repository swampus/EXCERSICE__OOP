package com.swampus.excercise.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Task7DeveloperTest {

    @Test
    public void checkConstructor() throws Exception {

        Class[] cArg = new Class[3]; //Our constructor has 3 arguments
        cArg[0] = String.class; //First argument is of *object* type Long
        cArg[1] = String.class; //Second argument is of *object* type String
        cArg[2] = String.class; //Third argument is of *primitive* type int
        Task7Developer newInstance = (Task7Developer) Task7Developer.class
                .getDeclaredConstructor(cArg).newInstance("A", "B", "C");

        assertNotNull(newInstance);
    }
}