package com.jlu.adapter.test;

import com.jlu.adapter.interfaces.IAdapter;
import com.jlu.adapter.wrapper.ClassAdapter;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/28
 * Time:23:30
 * see:类适配器测试类
 */
public class ClassAdaterTest {

    public static void main(String[] args){
        IAdapter adaper = new ClassAdapter();
        adaper.method1();
        adaper.method2();
        adaper.method3();
}

}
