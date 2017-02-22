package com.jlu.multifactory.isendimp;


import com.jlu.multifactory.isender.Sender;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/26
 * Time:15:57
 * see:
 */
public class EmailSender implements Sender {

    @Override
    public void send() {
        System.out.println("send sms");
    }
}
