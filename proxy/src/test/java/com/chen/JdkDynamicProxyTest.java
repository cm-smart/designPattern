package com.chen;

import com.chen.jdkDyProxy.Animal;
import com.chen.jdkDyProxy.Cat;
import com.chen.jdkDyProxy.JdkDynamicProxy;

import java.lang.reflect.Proxy;

public class JdkDynamicProxyTest {
    public static void main(String[] args) {
        Animal animal = new Cat("小花");
        JdkDynamicProxy jdkDynamicProxy = new JdkDynamicProxy(animal);
        Animal cat = (Animal) Proxy.newProxyInstance(jdkDynamicProxy.getClass().getClassLoader(),new Class[]{Animal.class},jdkDynamicProxy);
        cat.wakeup();
        cat.sleep();
    }
}
