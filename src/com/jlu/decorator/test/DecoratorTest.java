package com.jlu.decorator.test;

import com.jlu.decorator.component.Berverage;
import com.jlu.decorator.componentimp.CoffeeBean1;
import com.jlu.decorator.concretwrapper.Milk;
import com.jlu.decorator.concretwrapper.Mocha;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/30
 * Time:21:42
 * see:装饰模式测试类
 */
public class DecoratorTest {
    public static void main(String[] args){
        Berverage berverage = new CoffeeBean1();
        berverage = new Milk(berverage);
        berverage = new Mocha(berverage);
        System.out.println(berverage.getDescription()+"\n价格："+berverage.getPrice());
    }

}
