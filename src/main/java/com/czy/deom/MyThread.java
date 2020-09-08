package com.czy.deom;

public class MyThread{

    public void MyThread1(int id, int command){
        synchronized (MyThread.class) {
            Device device = new Device();
            device.devicexs(id, command);
        }
    }


}
