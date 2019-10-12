package com.yao;


import com.yao.Interface.Packing;

/**
 * @author pengjie_yao
 * @date 2019/10/1212:02
 */
public class Bottle implements Packing {

    /**
     *  包装类型
     * @return
     */
    @Override
    public String pack() {
        return "瓶装";
    }
}
