package com.yao.abstractfactory;

import com.yao.abstractfactory.Interface.Color;
import com.yao.abstractfactory.Interface.Shape;

/**
 * 填充颜色的工厂
 *
 * @author pengjie_yao
 * @date 2019/10/1110:59
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        switch (color) {
            case "red":
                return new Red();
            case "green":
                return new Green();
            case "blue":
                return new Blue();
            default:
                return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
