package com.chen;

/**
 * 装饰模式
 */
public class Test {
    public static void main(String[] args) {
        ICafe cafe = new ConcreteCafe();
        SugarDecorator sugarDecorator = new SugarDecorator(cafe);
        sugarDecorator.getCafe();
    }
}
