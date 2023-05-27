package com.chen;

public class SugarDecorator extends ConcreteDecorator {
    SugarDecorator(ICafe cafe) {
        super(cafe);
    }

    @Override
    public void getCafe() {
        super.getCafe();
        System.out.println("Add sugar");
    }
}
