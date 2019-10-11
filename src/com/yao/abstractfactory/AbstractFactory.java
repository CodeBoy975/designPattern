package com.yao.abstractfactory;

import com.yao.abstractfactory.Interface.Color;
import com.yao.abstractfactory.Interface.Shape;

/**
 *  抽象工厂
 * @author pengjie_yao
 * @date 2019/10/1110:53
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
