package com.jlu.observer.subject;

import com.jlu.observer.iobserver.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/30
 * Time:23:46
 * see:抽象主题类，负责注册、注销和通知观察者
 */
public class Subject {

    private List<Observer> oList = new ArrayList<Observer>();

    //定义注册方法
    public void RegisterObserver(Observer observer){
        oList.add(observer);
    }
    //定义销毁方法
    public void CancelObserver(Observer observer){
        oList.remove(observer);
    }
    //定义通知方法
    public void NotifyAllObserve(String state){
        for(Observer observer : oList){
            observer.update(state);
        }
    }
}
