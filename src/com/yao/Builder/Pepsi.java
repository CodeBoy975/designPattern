package com.yao.Builder;

/**
 * @author pengjie_yao
 * @date 2019/10/1212:09
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 4.0f;
    }
}
