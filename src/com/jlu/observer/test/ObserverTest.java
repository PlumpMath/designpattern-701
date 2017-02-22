package com.jlu.observer.test;

import com.jlu.observer.observed.Display;
import com.jlu.observer.observed.Heater;
import com.jlu.observer.observer.Alarm;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/12/1
 * Time:0:15
 * see:观察者模式测试类
 */
public class ObserverTest {
    public static void main(String[] args){
        Heater heater = new Heater();
        Display display = new Display();
        Alarm alarm = new Alarm();
        heater.RegisterObserver(display);
        display.RegisterObserver(alarm);
        heater.boildWater();


    }
}
