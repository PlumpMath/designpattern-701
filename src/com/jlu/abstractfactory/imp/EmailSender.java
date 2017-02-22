package com.jlu.abstractfactory.imp;

import com.jlu.abstractfactory.interfaces.Sender;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/26
 * Time:22:39
 * see:
 */
public class EmailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is email sender");
    }
}
