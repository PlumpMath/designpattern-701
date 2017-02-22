package com.jlu.decorator.componentimp;

import com.jlu.decorator.component.Berverage;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/30
 * Time:21:28
 * see:接口实现类
 */
public class CoffeeBean1 implements Berverage {
    private String description="选择了第一种咖啡豆";
    @Override
    public String getDescription() {

        return description;
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
