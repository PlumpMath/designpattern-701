package com.jlu.decorator.concretwrapper;

import com.jlu.decorator.component.Berverage;
import com.jlu.decorator.wrapper.CofferWrapper;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/30
 * Time:21:34
 * see:
 */
public class Milk extends CofferWrapper {
    private Berverage berverage=null;//延迟加载
    private  String description = "加了牛奶";

    public Milk(Berverage berverage) {
        this.berverage = berverage;
    }

    @Override
    public String getDescription() {
        return berverage.getDescription()+"\n"+description;
    }

    @Override
    public int getPrice() {
        return berverage.getPrice()+6;
    }
}
