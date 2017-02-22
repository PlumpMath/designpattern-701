package com.jlu.bridge;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/12/16
 * Time:21:37
 * see:电器接口实现类
 */
public class Light implements IElectricalProduct {
    @Override
    public void powerOn() {
        System.out.println("电灯开启了");
    }

    @Override
    public void powerOff() {
        System.out.println("电灯关闭了");
    }
}
