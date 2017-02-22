package com.jlu.builder.test;

import com.jlu.builder.builder.Builder;
import com.jlu.builder.isender.Sender;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/27
 * Time:20:08
 * see:测试类
 */
public class BuilderTest {
    public static void main(String[] args){
        Builder builder = new Builder();
        builder.produceEmailSender(3);
    }
}
