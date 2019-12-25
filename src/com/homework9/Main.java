package com.homework9;

import com.homework9.task1.Task1;
import com.homework9.task2.SafeDivision;

public class Main {

    public static void main(String[] args) {
        new Task1().printAllCaughtException();
        new SafeDivision().run();
    }
}
