package com.jlu.bridge;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/12/4
 * Time:11:19
 * see:开关子类
 */
public class NormalSwitch extends Switch {
    @Override
    public void on() {
        System.out.println("普通开关开了");
    }

    @Override
    public void off() {
        System.out.println("普通开关关了");
    }
}
