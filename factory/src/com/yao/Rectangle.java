package com.yao;

import com.yao.factory.Interface.Shape;

/**
 * 矩形
 *
 * @author pengjie_yao
 * @date 2019/10/1110:21
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("所画的是矩形");

    }
}
