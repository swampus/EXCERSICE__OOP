package com.swampus.excercise.task;

import com.swampus.excercise.not.modify.clazz.QInDeComparator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1JuniorTest {

    @Test
    public void checkInterface() {
        assertEquals(1, Task1Junior.class.getInterfaces().length);
        assertEquals(QInDeComparator.class, Task1Junior.class.getInterfaces()[0]);
    }
}