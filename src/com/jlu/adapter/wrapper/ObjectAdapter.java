package com.jlu.adapter.wrapper;

import com.jlu.adapter.interfaces.IAdapter;
import com.jlu.adapter.source.Source;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/28
 * Time:23:40
 * see:对象适配器
 */
public class ObjectAdapter implements IAdapter {
    //声明资源对象
    private  Source source;

    //创建构造方法
    public ObjectAdapter( Source source){
        this.source=source;
    }

    @Override
    public void method1() {
        System.out.println("this is objectadapter's method1");
    }

    @Override
    public void method2() {
        System.out.println("this is objectadapter's method2");

    }

    @Override
    public void method3() {
        source.method3();
    }
}
