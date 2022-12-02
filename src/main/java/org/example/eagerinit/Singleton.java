package org.example.eagerinit;
/**
 * Eager initialization(이른 초기화)
 * */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }

}
