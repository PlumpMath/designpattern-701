package com.jlu.facade.face;

import com.jlu.facade.concrete.Drug;
import com.jlu.facade.concrete.Payment;
import com.jlu.facade.concrete.Register;
import com.jlu.facade.concrete.Treatment;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/12/1
 * Time:22:56
 * see:门面类，相当于接待处
 */
public class Host {
    private Register register = null;
    private Treatment treatment = null;
    private Payment payment = null;
    private Drug drug = null;

    public Host() {
        register = new Register();
        treatment = new Treatment();
        payment = new Payment();
        drug = new Drug();
    }

    //挂号
    public void register(){
        register.register();
    }
    //门诊
    public void treat(){
        treatment.treat();
    }
    //付费
    public void pay(){
        payment.pay();
    }
    //q取药
    public void drug(){
        drug.takeDrug();
    }

}
