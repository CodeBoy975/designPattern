package com.yao.strategy.features;

import com.yao.strategy.features.Interface.FlyInterface;

/**
 * 描述： 仅仅会飞的能力
 *
 * @author pengjie_yao
 * @date 2019/9/12 8:54
 */
public class FlyWithWings  implements FlyInterface {

    @Override
    public void fly() {
        System.out.println("我仅仅会飞");
    }
}
