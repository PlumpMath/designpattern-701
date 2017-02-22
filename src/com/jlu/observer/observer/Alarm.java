package com.jlu.observer.observer;

import com.jlu.observer.iobserver.Observer;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/30
 * Time:23:55
 * see:警报器，观察者
 */
public class Alarm implements Observer{
    @Override
    public void update(String state) {
        boolean isBoil = Boolean.parseBoolean(state);
        if(isBoil){
            System.out.println("水开了，警报响起");
        }
    }
}
