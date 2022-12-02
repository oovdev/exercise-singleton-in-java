package org.example.lazyholder;

public class Singleton {

    private Singleton() {}

    //inner class(중첩클래스)
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
