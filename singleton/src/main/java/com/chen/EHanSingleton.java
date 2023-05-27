package com.chen;

/**
 * 饿汉模式
 */
public class EHanSingleton {
    public static Person person = new Person();

    public static Person getInstance(){
        return person;
    }
}
