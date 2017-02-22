package com.jlu.simplefactory.senderfactory;

import com.jlu.simplefactory.isender.Sender;
import com.jlu.simplefactory.isendimp.EmailSender;
import com.jlu.simplefactory.isendimp.SMSSender;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/26
 * Time:15:59
 * see:sender类生产工厂
 */
public class SenderFactory {
    /**
    *@Author freedom
    *@Date 2016/11/26 ，16:06
    *see:根据输入类型批量生产sender
    *Return:sender
    *Param:实现类的类型
    */
    public Sender produce(String type){
        try{
            if("SMS".equalsIgnoreCase(type)){
                return new SMSSender();
            }else if("Email".equalsIgnoreCase(type)){
                return new EmailSender();
            }else{
                throw new RuntimeException("请输入正确的类型");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
