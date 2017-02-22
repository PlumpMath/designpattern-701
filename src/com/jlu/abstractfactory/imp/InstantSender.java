package com.jlu.abstractfactory.imp;

import com.jlu.abstractfactory.interfaces.Sender;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/26
 * Time:22:51
 * see:
 */
public class InstantSender implements Sender {
    @Override
    public void send() {
        System.out.print("this is instant sender");
    }
}
