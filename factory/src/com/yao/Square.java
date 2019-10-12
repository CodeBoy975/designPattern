package com.yao;


import com.yao.Interface.Shape;

/**
 * 正方形
 *
 * @author pengjie_yao
 * @date 2019/10/1110:22
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("所画的是正方形");
    }
}
