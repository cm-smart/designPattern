package com.chen;

public class ConcreteHandlerB extends Handler {
    @Override
    public void handler(String condition) {
        if(condition.equals("B")){
            System.out.println("ConcreteHandlerB处理请求");
        }else{

            Handler handler = this.getNextHandler();
            if(handler == null){
                System.out.println("ConcreteHandlerB========责任链结束");
            }else{
                System.out.println("ConcreteHandlerB==========请求转发");
                handler.handler(condition);
            }
        }
    }
}
