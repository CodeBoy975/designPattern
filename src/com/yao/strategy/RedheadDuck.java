package com.yao.strategy;

import com.yao.strategy.features.FlyNoWays;
import com.yao.strategy.features.Quack;

/**
 * 描述： 红头鸭
 *
 * @author pengjie_yao
 * @date 2019/9/12 8:52
 */
public class RedheadDuck extends  Duck {


    /**
     *  在构造器中实现对接口的实现类
     */
    public  RedheadDuck() {
        flyInterface = new FlyNoWays();
        quackInterface = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是红头鸭子");
    }
}
