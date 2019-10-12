package com.yao;

/**
 * @author pengjie_yao
 * @date 2019/10/1115:26
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("所化的是圆形");
    }
}
