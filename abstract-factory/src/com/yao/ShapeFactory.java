package com.yao;


import com.yao.abstractfactory.Interface.Color;
import com.yao.abstractfactory.Interface.Shape;

/**
 * 形状的工厂类
 *
 * @author pengjie_yao
 * @date 2019/10/1110:24
 */
public class ShapeFactory  extends AbstractFactory{


    /**
     * 获取对应的形状
     *
     * @param shapeType 形状类型
     * @return
     */
    @Override
    public Shape getShape(String shapeType) {

        switch (shapeType) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }

    /**
     *  获取对应填充的颜色
     * @param color
     * @return
     */
    @Override
    public Color getColor(String color) {
        return null;
    }
}
