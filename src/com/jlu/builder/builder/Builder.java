package com.jlu.builder.builder;

import com.jlu.builder.imp.EmailSender;
import com.jlu.builder.imp.SMSSender;
import com.jlu.builder.isender.Sender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/27
 * Time:20:04
 * see:建造者模式
 */
public class Builder {
    private List<Sender> senderList = new ArrayList<Sender>();

    //建造sms类
    public void produceSMSSender(int count){
        for (int i = 0 ; i<count; i++){
            senderList.add(new SMSSender());
        }
    }

    //建造Email类
    public void produceEmailSender(int count){
        for (int i = 0 ; i<count; i++){
            senderList.add(new EmailSender());
        }
    }
}
