package com.jlu.multifactory.test;


import com.jlu.multifactory.isender.Sender;
import com.jlu.multifactory.sendfactory.SendFoctory;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/26
 * Time:22:10
 * see:测试类
 */
public class MutilFactoryTest {

    public static void main(String [] args){
        SendFoctory factory = new SendFoctory();
        Sender mailSend = factory.MailProduce();
        mailSend.send();
    }


}
