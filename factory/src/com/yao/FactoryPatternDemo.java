package com.yao;


import com.yao.Interface.Shape;

/**
 * 简单工厂demo
 *
 * @author pengjie_yao
 * @date 2019/10/1110:28
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

    }
}
