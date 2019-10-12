package com.yao.decoratordemo2;

import com.yao.decoratordemo2.Interface.Shape;

/**
 *  Shape接口的抽象装饰类
 *
 * @author pengjie_yao
 * @date 2019/10/129:30
 */
public abstract class ShapeDecorator  implements Shape {

    /**
     *  作为对象
     */
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }
}
