package com.yao;


import com.yao.Interface.Shape;

/**
 * 圆形
 *
 * @author pengjie_yao
 * @date 2019/10/1110:23
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("所画的是圆形");
    }
}
