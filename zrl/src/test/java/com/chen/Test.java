package com.chen;

import com.chen.ConcreteHandlerA;
import com.chen.ConcreteHandlerB;
import com.chen.Handler;

public class Test {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();

        handlerA.setNextHandler(handlerB);

        handlerA.handler("B");
    }
}
