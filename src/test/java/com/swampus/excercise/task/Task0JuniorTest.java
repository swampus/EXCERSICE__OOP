package com.swampus.excercise.task;

import com.swampus.excercise.not.modify.clazz.TParserOfContinue;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.ComponentScan;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ComponentScan
public class Task0JuniorTest {

    @Test
    public void nameExtends() {
        assertEquals(TParserOfContinue.class, Task0Junior.class.getSuperclass());
    }
}