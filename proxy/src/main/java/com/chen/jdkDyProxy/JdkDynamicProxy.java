package com.chen.jdkDyProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkDynamicProxy implements InvocationHandler {

    private Object bean;

    public JdkDynamicProxy(Object bean){
        this.bean = bean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if (methodName.equals("wakeup")){
            System.out.println("早安~~~");
        }else if(methodName.equals("sleep")){
            System.out.println("晚安~~~");
        }
        return method.invoke(bean,args);
    }
}
