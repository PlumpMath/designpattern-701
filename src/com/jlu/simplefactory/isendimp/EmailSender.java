package com.jlu.simplefactory.isendimp;

import com.jlu.simplefactory.isender.Sender;

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
        System.out.println("email send");
    }
}
