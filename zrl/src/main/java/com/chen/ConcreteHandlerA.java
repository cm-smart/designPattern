package com.chen;

public class ConcreteHandlerA extends Handler {

    @Override
    public void handler(String condition) {
        if(condition.equals("A")){
            System.out.println("ConcreteHandlerA处理请求");
        }else{

            Handler handler = this.getNextHandler();
            if(handler == null){
                System.out.println("ConcreteHandlerA========责任链结束");
            }else{
                System.out.println("ConcreteHandlerA==========请求转发");
                handler.handler(condition);
            }
        }
    }
}
