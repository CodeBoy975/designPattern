package com.yao.strategy;

import com.yao.strategy.features.Interface.FlyInterface;
import com.yao.strategy.features.Interface.QuackInterface;

/**
 * 描述： 超类
 *
 * @author pengjie_yao
 * @date 2019/9/12 8:45
 */
public abstract class Duck {


    /**
     *  飞功能
     */
    public FlyInterface flyInterface;

    /**
     *  叫声
     */
    public QuackInterface quackInterface;


    public void setFlyInterface(FlyInterface flyInterface){
        this.flyInterface = flyInterface;
    }
    public void setQuackInterface(QuackInterface quackInterface){
        this.quackInterface = quackInterface;
    }


    /**
     *  面向接口编程：叫声
     */
    public void performQuack(){
        quackInterface.quack();
    }

    /**
     *  面向接口编程：飞行能力
     */
    public void performFly() {
        flyInterface.fly();
    }


    /**
     * 外观
     */
    public abstract void display();
}
