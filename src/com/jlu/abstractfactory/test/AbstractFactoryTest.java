package com.jlu.abstractfactory.test;

import com.jlu.abstractfactory.factory.InstantSenderFactory;
import com.jlu.abstractfactory.factory.SMSSenderFactory;
import com.jlu.abstractfactory.interfaces.Sender;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/26
 * Time:22:48
 * see:
 */
public class AbstractFactoryTest {
    public static void main(String[] args){
        SMSSenderFactory factory = new SMSSenderFactory();
        Sender sender = factory.prpduce();
        sender.send();
        InstantSenderFactory instantSenderFactory = new InstantSenderFactory();
        Sender iSend = instantSenderFactory.prpduce();
        iSend.send();

    }
}
