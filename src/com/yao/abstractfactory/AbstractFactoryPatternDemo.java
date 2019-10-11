package com.yao.abstractfactory;

import com.yao.abstractfactory.Interface.Color;
import com.yao.abstractfactory.Interface.Shape;

/**
 *  抽象工厂的Demo测试
 * @author pengjie_yao
 * @date 2019/10/1111:04
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        // 获取形状的工厂
        AbstractFactory shapeFactory = FactoryProducer.getAbstractFactory("shape");
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        // 获取颜色的工厂
        AbstractFactory color = FactoryProducer.getAbstractFactory("color");
        Color red = color.getColor("red");
        red.fill();

    }
}
