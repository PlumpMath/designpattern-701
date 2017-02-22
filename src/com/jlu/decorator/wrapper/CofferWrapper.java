package com.jlu.decorator.wrapper;

import com.jlu.decorator.component.Berverage;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/30
 * Time:21:33
 * see:
 */
public class CofferWrapper implements Berverage {

    private String description = "我只是装饰器。没有什么具体描述";
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return 0;//价格由具体的装饰类定义
    }
}
