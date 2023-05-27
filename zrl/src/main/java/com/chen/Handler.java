package com.chen;

public abstract class Handler {
    //下一个处理类
    private Handler nextHandler;

    //处理方法
    public abstract void handler(String condition);

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
