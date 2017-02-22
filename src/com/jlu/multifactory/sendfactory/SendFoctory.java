package com.jlu.multifactory.sendfactory;

import com.jlu.multifactory.isender.Sender;
import com.jlu.multifactory.isendimp.EmailSender;
import com.jlu.multifactory.isendimp.SMSSender;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/26
 * Time:22:06
 * see:
 */
public class SendFoctory {

    public Sender MailProduce(){
        return new EmailSender();
    }
    public Sender SMSProduce(){
        return new SMSSender();
    }
}
