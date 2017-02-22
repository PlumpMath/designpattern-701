package com.jlu.adapter.wrapper;

import com.jlu.adapter.interfaces.IAdapter;
import com.jlu.adapter.source.Source;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/28
 * Time:23:20
 * see:
 */
public class ClassAdapter extends Source implements IAdapter {
    @Override
    public void method1() {
        System.out.println("this is classadapter's method1");
    }

    @Override
    public void method2() {
        System.out.println("this is classadapter's method2");

    }


}
