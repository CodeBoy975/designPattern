package com.yao.Builder;

import com.yao.Builder.Interface.Packing;

/**
 *  包装的是包装纸
 * @author pengjie_yao
 * @date 2019/10/1212:02
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "包装纸";
    }
}
