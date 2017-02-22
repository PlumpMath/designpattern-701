package com.jlu.abstractfactory.factory;

import com.jlu.abstractfactory.imp.SMSSender;
import com.jlu.abstractfactory.interfaces.Provider;
import com.jlu.abstractfactory.interfaces.Sender;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/26
 * Time:22:45
 * see:
 */
public class SMSSenderFactory implements Provider {
    @Override
    public Sender prpduce() {
        return new SMSSender();
    }
}
