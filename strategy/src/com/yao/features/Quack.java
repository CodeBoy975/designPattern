package com.yao.features;


import com.yao.features.Interface.QuackInterface;

/**
 * 描述： 实现呱呱叫
 *
 * @author pengjie_yao
 * @date 2019/9/12 8:58
 */
public class Quack implements QuackInterface {
    @Override
    public void quack() {
        System.out.println("我呱呱叫");
    }
}
