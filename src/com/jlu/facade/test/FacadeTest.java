package com.jlu.facade.test;

import com.jlu.facade.face.Host;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/12/1
 * Time:23:05
 * see:门面类测试类
 */
public class FacadeTest {
    public static void main(String[] args){
        Host host = new Host();
        host.register();
        host.treat();
        host.pay();
        host.drug();
    }


}
