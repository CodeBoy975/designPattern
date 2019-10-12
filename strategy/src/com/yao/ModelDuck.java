package com.yao;


import com.yao.features.FlyNoWays;
import com.yao.features.Quack;

/**
 * 描述： 模型鸭
 *
 * @author pengjie_yao
 * @date 2019/9/12 9:03
 */
public class ModelDuck extends Duck {


    /**
     *  在构造器中实现对接口的实现类
     */
    public  ModelDuck() {
        flyInterface = new FlyNoWays();
        quackInterface = new Quack();
    }


    @Override
    public void display() {
        System.out.println("我是模型鸭子");
    }
}
