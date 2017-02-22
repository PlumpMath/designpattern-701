package com.jlu.adapter.test;

import com.jlu.adapter.interfaces.IAdapter;
import com.jlu.adapter.source.Source;
import com.jlu.adapter.wrapper.ObjectAdapter;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/28
 * Time:23:44
 * see:
 */
public class ObjectAdapterTest {

    public static void main(String[] args){
        Source source = new Source();
        IAdapter adapter = new ObjectAdapter(source);
        adapter.method1();
        adapter.method2();
        adapter.method3();

    }
}
