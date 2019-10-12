package com.yao.decoratordemo2;

import com.yao.decoratordemo2.Interface.Shape;

/**
 * @author pengjie_yao
 * @date 2019/10/129:34
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        //Shape redCircle = new RedShapeDecorator(new Circle());
        //Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("正常圆形========");
        circle.draw();

        System.out.println("红色圆形========");
        redCircle.draw();

        System.out.println("红色长方形========");
        redRectangle.draw();
    }
}
