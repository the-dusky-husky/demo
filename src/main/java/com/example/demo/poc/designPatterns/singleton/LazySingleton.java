package com.example.demo.poc.designPatterns.singleton;

public class LazySingleton {

    private static volatile LazySingleton lazySingleton;

    //don't try to return value
    private LazySingleton() throws IllegalAccessException{
        if (lazySingleton!=null){
            throw new IllegalAccessException();
        }
    }

    public static LazySingleton getInstance()  {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton==null) {
                    try {
                        lazySingleton = new LazySingleton();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return lazySingleton;
    }

    private Object readResolve(){
        return lazySingleton;
    }

}
