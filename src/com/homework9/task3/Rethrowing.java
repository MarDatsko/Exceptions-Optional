package com.homework9.task3;

public class Rethrowing{
    public void firstMethod() throws Exception {
        secondMethod();
    }

    private void secondMethod() throws Exception {
        throw new Exception();
    }
}
