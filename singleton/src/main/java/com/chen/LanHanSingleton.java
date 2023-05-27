package com.chen;

/**
 * 懒汉模式
 */
public class LanHanSingleton {
    public static Person person = null;

    /**
     * 双重校验
     * @return
     */
    public static Person getInstance(){
        if(person == null){
            synchronized (LanHanSingleton.class){
                if(person == null){
                    person = new Person();
                }
            }
        }
        return person;
    }
}
