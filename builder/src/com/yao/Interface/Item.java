package com.yao.Interface;

/**
 *  食物的接口
 * @author pengjie_yao
 * @date 2019/10/1212:00
 */
public interface Item {
    /**
     *  商品名
     * @return
     */
    public String name();

    /**
     *  包装
     * @return
     */
    public Packing packing();

    /**
     *  价格
     * @return
     */
    public float price();
}
