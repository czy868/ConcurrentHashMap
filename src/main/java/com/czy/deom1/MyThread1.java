package com.czy.deom1;

import com.czy.deom.Device;
import com.czy.deom.MyThread;

import java.util.concurrent.ConcurrentHashMap;

public class MyThread1 implements Runnable{

    private final ConcurrentHashMap<Integer ,Integer> concurrentHashMap = new ConcurrentHashMap<>();
    private int deviceid;
    private int command;
    public MyThread1(int deviceid, int command){
        this.deviceid=deviceid;
        this.command=command;
    }

    @Override
    public void run() {
        Device device = new Device();
        while (true){
            if (concurrentHashMap.containsKey(deviceid)==false){
                concurrentHashMap.put(deviceid,command);
            }
            else {
                concurrentHashMap.replace(deviceid, command);
                break;
            }
        }
        MapDevice mapDevice = new MapDevice();
        mapDevice.devicexs(concurrentHashMap);
    }
}
