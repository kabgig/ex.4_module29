package org.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Deletable deletable = (Deletable) clazz.getConstructor().newInstance();
        Method delete = deletable.getClass().getMethod("delete", String.class);
        delete.invoke(deletable,"blablabla" );

    }
}