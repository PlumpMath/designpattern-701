package com.jlu.bridge;

/**
 * Created by IntelliJ IDEA.
 * User:Administrator
 * Date:2016/12/4
 * Time:11:09
 * see:开关父类，由于需要和电器建立连接，所以开关类需要有电器的实例
 */
public class Switch {
    private IElectricalProduct electricalProduct;

    public IElectricalProduct getElectricalProduct() {
        return electricalProduct;
    }

    public void setElectricalProduct(IElectricalProduct electricalProduct) {
        this.electricalProduct = electricalProduct;
    }

    public void on() {
    }

    public void off() {
    }

}
