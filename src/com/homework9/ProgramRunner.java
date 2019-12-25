package com.homework9;

import com.homework9.task1.Task1;
import com.homework9.task2.SafeDivision;
import com.homework9.task3.Rethrowing;

public class ProgramRunner {
    public void runProgram(){
        new Task1().printAllCaughtException();
        new SafeDivision().runApplication();
        try {
            new Rethrowing().firstMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
