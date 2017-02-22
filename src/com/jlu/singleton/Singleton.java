package com.jlu.singleton;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/11/26
 * Time:23:48
 * see:单例模式最经典的创建方法
 */
public class Singleton {

    //将构造方法私有化，防止被实例化
    private Singleton(){

    }
    //使用内部类来维护一个单例,可以避免双重检验赋值和初始化顺序不确定导致的问题，
    // 因为类的加载是线程互斥的，同时赋值和初始化顺序有保证
    private static class SingletonFactory{
        private static Singleton instance = new Singleton();
    }

    //创建一个方法返回一个实例
    private static Singleton getInstance(){
        return SingletonFactory.instance;
    }

    //如果对象被序列化，保证序列化前后对象不变
    public Object readResolve(){
        return getInstance();
    }
}
