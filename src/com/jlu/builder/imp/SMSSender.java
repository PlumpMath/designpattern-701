package com.jlu.builder.imp;

import com.jlu.builder.isender.Sender;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/27
 * Time:19:58
 * see:
 */
public class SMSSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender");
    }
}
