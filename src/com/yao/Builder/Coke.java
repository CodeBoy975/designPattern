package com.yao.Builder;

/**
 * @author pengjie_yao
 * @date 2019/10/1212:09
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public float price() {
        return 5.0f;
    }
}
