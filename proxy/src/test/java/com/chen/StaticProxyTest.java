package com.chen;

import com.chen.staticProxy.IRentHouse;
import com.chen.staticProxy.IntermediaryProxy;
import com.chen.staticProxy.RentHouse;

public class StaticProxyTest {
    public static void main(String[] args) {
        IRentHouse rentHouse = new RentHouse();
        IntermediaryProxy intermediaryProxy = new IntermediaryProxy(rentHouse);
        intermediaryProxy.rentHouse();
    }
}
