package com.yao;

/**
 * 蔬菜汉堡
 *
 * @author pengjie_yao
 * @date 2019/10/1212:06
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
