package com.jlu.observer.observed;

import com.jlu.observer.iobserver.Observer;
import com.jlu.observer.subject.Subject;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/30
 * Time:23:55
 * see:显示器 观察者和被观察者
 */
public class Display extends Subject implements Observer{

    private int temperate;
    private boolean isBoiled = false;

    public boolean isBoiled() {
        return isBoiled;
    }

    public void setBoiled(boolean boiled) {
        isBoiled = boiled;
    }

    @Override
    public void update(String state) {
        temperate = Integer.parseInt(state);//获取温度
        System.out.println("当前温度是："+temperate);
        if (temperate > 100){
            this.setBoiled(true);//水开了
            this.NotifyAllObserve(Boolean.toString(this.isBoiled()));//通知警报器
        }

    }
}
