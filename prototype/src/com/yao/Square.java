package com.yao;

/**
 * @author pengjie_yao
 * @date 2019/10/1115:26
 */
public class Square extends Shape {

    public Square(){
        type = "square";
    }

    @Override
    void draw() {
        System.out.println("所化的是正方形");
    }
}
