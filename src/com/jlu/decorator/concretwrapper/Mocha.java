package com.jlu.decorator.concretwrapper;

import com.jlu.decorator.component.Berverage;
import com.jlu.decorator.wrapper.CofferWrapper;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/30
 * Time:21:38
 * see:
 */
public class Mocha extends CofferWrapper {
    private String description = "加了摩卡";
    private Berverage berverage;

    public Mocha(Berverage berverage) {
        this.berverage = berverage;
    }

    @Override
    public String getDescription() {
        return berverage.getDescription()+"\n"+description;
    }

    @Override
    public int getPrice() {
        return berverage.getPrice()+8;
    }
}
