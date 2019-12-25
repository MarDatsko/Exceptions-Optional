package com.homework9.task1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public void printAllCaughtException() {
        catchExceptionA();
        catchExceptionB();
        catchNullPointerException();
        catchIOException();
    }

    public void catchExceptionA() {
        try {
            throw new ExceptionA();
        } catch (ExceptionA exception) {
            exception.printStackTrace();
        }
    }

    public void catchExceptionB() {
        try {
            throw new ExceptionB();
        } catch (ExceptionB exception) {
            exception.printStackTrace();
        }
    }

    public void catchNullPointerException() {
        try {
            Object object = null;
            object.hashCode();
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }
    }

    public void catchIOException() {
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get("fileName"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
