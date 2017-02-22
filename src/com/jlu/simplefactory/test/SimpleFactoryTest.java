package com.jlu.simplefactory.test;

import com.jlu.simplefactory.isender.Sender;
import com.jlu.simplefactory.senderfactory.SenderFactory;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/26
 * Time:16:06
 * see:测试类
 */
public class SimpleFactoryTest {

    public static  void main(String [] args){
        //创建工厂对象
        SenderFactory factory = new SenderFactory();
        Sender send = factory.produce("EMail");
        send.send();
    }
}
