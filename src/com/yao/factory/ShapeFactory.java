package com.yao.factory;

import com.yao.factory.Interface.Shape;

/**
 * 形状的工厂类
 *
 * @author pengjie_yao
 * @date 2019/10/1110:24
 */
public class ShapeFactory {


    /**
     * 获取对应的形状
     *
     * @param shapeType 形状类型
     * @return
     */
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
}
