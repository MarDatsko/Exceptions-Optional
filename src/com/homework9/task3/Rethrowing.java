package com.homework9.task3;

public class Rethrowing{
    public void rethrowException() throws Exception {
        throwException();
    }

    private void throwException() throws Exception {
        throw new Exception();
    }
}
