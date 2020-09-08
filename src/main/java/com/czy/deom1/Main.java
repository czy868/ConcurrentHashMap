package com.czy.deom1;

import com.czy.deom.Device;
import com.czy.deom.MyThread;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {

    Executor execute = Executors.newFixedThreadPool(10);
    //ConcurrentHashMap<Integer ,Integer> concurrentHashMap = new ConcurrentHashMap<>();

    public void device(int deviceid,int command){
        Device device = new Device();
        MyThread1 myThread1 = new MyThread1(deviceid,command);
        execute.execute(myThread1);
    }
}
