package com.yao;


import com.yao.Interface.Shape;

/**
 * @author pengjie_yao
 * @date 2019/10/129:30
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("形状: 长方形");
    }
}
