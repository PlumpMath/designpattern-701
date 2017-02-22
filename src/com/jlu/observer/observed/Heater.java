package com.jlu.observer.observed;

import com.jlu.observer.subject.Subject;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/30
 * Time:23:54
 * see:热水器 被观察者
 */
public class Heater extends Subject {
    private int temperate;

    public void setTemperate(int temperate) {
        this.temperate = temperate;
    }

    public int getTemperate() {

        return temperate;
    }
   //定义烧水方法
    public void boildWater(){
        for (int i = 95; i < 105; i++) {
            temperate=i;
            this.setTemperate(temperate);
            this.NotifyAllObserve(Integer.toString(this.getTemperate()));
        }
    }
}
