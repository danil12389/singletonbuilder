package org.example.singleton;

public class SingletonImpl {

    private static SingletonImpl singleton;


    private SingletonImpl() {
    }

    public static SingletonImpl getSingleton() {
        if(singleton == null) {
            singleton =  new SingletonImpl();
        }
        return singleton;
    }
}