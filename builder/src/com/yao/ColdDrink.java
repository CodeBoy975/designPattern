package com.yao;


import com.yao.Interface.Item;
import com.yao.Interface.Packing;

/**
 * 饮料
 *
 * @author pengjie_yao
 * @date 2019/10/1212:05
 */
public abstract class ColdDrink implements Item {

    /**
     * @return 包装的是： 瓶装
     */
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
