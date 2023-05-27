package com.chen;

public class ConcreteDecorator implements ICafe{
    private ICafe cafe;

    ConcreteDecorator(ICafe cafe){
        this.cafe = cafe;
    }

    @Override
    public void getCafe() {
        cafe.getCafe();
    }
}
