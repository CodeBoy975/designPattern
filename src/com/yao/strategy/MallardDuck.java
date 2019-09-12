package com.yao.strategy;

import com.yao.strategy.features.FlyNoWays;
import com.yao.strategy.features.Quack;

/**
 * 描述： 绿头鸭
 *
 * @author pengjie_yao
 * @date 2019/9/12 8:50
 */
public class MallardDuck extends Duck {


    /**
     * 构造器中实现接口的实现类
     */
    public  MallardDuck() {
        flyInterface = new FlyNoWays();
        quackInterface = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是绿头鸭");
    }
}
