package com.yao.features;


import com.yao.features.Interface.FlyInterface;

/**
 * 描述： 火箭动力的飞行能力
 *
 * @author pengjie_yao
 * @date 2019/9/12 8:53
 */
public class FlyRocketPowered implements FlyInterface {

    @Override
    public void fly() {
        System.out.println("我拥有火箭动力的飞行能力");
    }
}
