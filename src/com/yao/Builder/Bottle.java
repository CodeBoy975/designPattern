package com.yao.Builder;

import com.yao.Builder.Interface.Packing;

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
