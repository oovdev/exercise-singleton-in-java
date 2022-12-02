package org.example.sync;

/**
 * synchronized(동기화) 키워드를 활용한 싱글톤패턴 for 멀티쓰레드 환경
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
