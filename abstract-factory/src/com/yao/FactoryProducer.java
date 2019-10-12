package com.yao;

/**
 *  工厂的创造器
 * @author pengjie_yao
 * @date 2019/10/1111:01
 */
public class FactoryProducer {

    /**
     *  根据类型获取对应的工厂
     * @param choose
     * @return
     */
    public static AbstractFactory getAbstractFactory(String choose) {
        if (choose.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (choose.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
