package com.jlu.abstractfactory.factory;

import com.jlu.abstractfactory.imp.InstantSender;
import com.jlu.abstractfactory.interfaces.Provider;
import com.jlu.abstractfactory.interfaces.Sender;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/26
 * Time:22:52
 * see:
 */
public class InstantSenderFactory implements Provider {
    @Override
    public Sender prpduce() {
        return new InstantSender();
    }
}
