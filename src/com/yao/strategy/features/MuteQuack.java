package com.yao.strategy.features;

import com.yao.strategy.features.Interface.QuackInterface;

/**
 * 描述： 不会叫
 *
 * @author pengjie_yao
 * @date 2019/9/12 9:00
 */
public class MuteQuack implements QuackInterface {
    @Override
    public void quack() {
        System.out.println("我不会叫");
    }
}
