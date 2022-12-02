package org.example.lazyinit;
/**
 * Lazy initialization(늦은 초기화)
 * */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
