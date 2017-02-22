package com.jlu.bridge;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/12/16
 * Time:21:39
 * see:桥接模式测试类
 */
public class BridgeTest {
    public static void main(String[] args) {
        IElectricalProduct fan = new Fan();//实例化风扇
        IElectricalProduct light = new Light();//实例化电灯
        Switch normalSwitch = new NormalSwitch();
        Switch fancySwitch = new FancySwitch();
        //实现开关控制电器
        normalSwitch.setElectricalProduct(fan);
        fancySwitch.setElectricalProduct(fan);
        fancySwitch.setElectricalProduct(light);
        //打开电器
        normalSwitch.getElectricalProduct().powerOn();
        fancySwitch.getElectricalProduct().powerOn();
    }
}
