package com.chen;

import com.chen.LanHanSingleton;
import com.chen.Person;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i = 0;i < 100;i++){
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    Person person = LanHanSingleton.getInstance();
                    System.out.println(person);
                }
            });
        }
    }
}
