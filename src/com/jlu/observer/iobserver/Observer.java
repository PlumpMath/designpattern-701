package com.jlu.observer.iobserver;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/30
 * Time:23:43
 * see:观测者接口
 */
public interface Observer {
    //定义一个更新方法
    public void update(String state);
}
