package com.jlu.abstractfactory.factory;

import com.jlu.abstractfactory.imp.EmailSender;
import com.jlu.abstractfactory.interfaces.Provider;
import com.jlu.abstractfactory.interfaces.Sender;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/26
 * Time:22:46
 * see:
 */
public class EmailSenderFactory implements Provider {
    @Override
    public Sender prpduce() {
        return new EmailSender();
    }
}
