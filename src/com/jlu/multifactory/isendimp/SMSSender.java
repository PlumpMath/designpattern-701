package com.jlu.multifactory.isendimp;


import com.jlu.multifactory.isender.Sender;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/26
 * Time:15:55
 * see:
 */
public class SMSSender implements Sender {
    @Override
    public void send() {
        System.out.println("SMS send");
    }
}
