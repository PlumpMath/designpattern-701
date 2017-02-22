package com.jlu.decorator.componentimp;

import com.jlu.decorator.component.Berverage;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/30
 * Time:21:30
 * see:
 */
public class CoffeeBean2 implements Berverage {

    private String description = "选择了第二中咖啡豆";
    @Override
    public String getDescription() {
        return description;

    }

    @Override
    public int getPrice() {
        return 6;
    }
}
