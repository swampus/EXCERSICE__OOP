package com.swampus.excercise.task;

import com.swampus.excercise.not.modify.clazz.MyCustomType;

/**
 * There is no way to create instance of that class.
 * Make it possible (No prams should be requested)
 */
public final class Task6Developer {

    private Task6Developer() {
    }

    protected Object doSomeStaff(){
         if(new MyCustomType().equals("")){
             //
             return new Task1Junior();
         }
         return null;
    }
}
