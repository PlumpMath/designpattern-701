package com.jlu.bridge;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/12/4
 * Time:11:19
 * see:开关子类
 */
public class FancySwitch extends Switch {
    @Override
    public void on() {
        System.out.println("新型开关开了");
    }

    @Override
    public void off() {
        System.out.println("新型开关关了");
    }
}
