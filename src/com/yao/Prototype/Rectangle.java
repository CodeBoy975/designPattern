package com.yao.Prototype;

/**
 * @author pengjie_yao
 * @date 2019/10/1115:26
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("所化的是长方形");
    }
}
