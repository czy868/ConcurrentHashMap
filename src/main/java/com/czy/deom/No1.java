package com.czy.deom;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.*;

public class No1 {

    Executor execute = Executors.newFixedThreadPool(10);

    public void device(int deviceid,int command){
        Device device = new Device();
        MyThread myThread = new MyThread();
        execute.execute(()->myThread.MyThread1(deviceid,command));
    }
}
