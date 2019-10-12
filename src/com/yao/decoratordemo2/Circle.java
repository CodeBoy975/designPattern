package com.yao.decoratordemo2;

import com.yao.decoratordemo2.Interface.Shape;

/**
 *  原型
 * @author pengjie_yao
 * @date 2019/10/129:30
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("形状: 圆形");
    }
}
