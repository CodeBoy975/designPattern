package com.yao.features;


import com.yao.features.Interface.FlyInterface;

/**
 * 描述： 不会飞
 *
 * @author pengjie_yao
 * @date 2019/9/12 8:55
 */
public class FlyNoWays implements FlyInterface {


    @Override
    public void fly() {
        System.out.println("我不会飞");
    }
}
