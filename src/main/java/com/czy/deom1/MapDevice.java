package com.czy.deom1;

import java.util.concurrent.ConcurrentHashMap;

public class MapDevice {
    public void devicexs(ConcurrentHashMap concurrentHashMap){
        if(concurrentHashMap.containsKey(1)){
            System.out.println(concurrentHashMap.get(1)+"  "+"1");
        }
    }

}
