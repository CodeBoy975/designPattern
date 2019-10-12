package com.yao;


import com.yao.Interface.Item;
import com.yao.Interface.Packing;

/**
 * 汉堡
 *
 * @author pengjie_yao
 * @date 2019/10/1212:04
 */
public abstract class Burger implements Item {

    /**
     * @return 包装的是：包装纸
     */
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
