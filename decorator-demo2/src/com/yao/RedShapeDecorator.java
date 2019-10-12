package com.yao;

import com.yao.decoratordemo2.Interface.Shape;

/**
 * @author pengjie_yao
 * @date 2019/10/129:32
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        // 在原有基础上扩展功能
        setRedShapeDecorator(decoratedShape);
    }

    private void setRedShapeDecorator(Shape decoratedShape) {
        System.out.println("外形颜色:红色");
    }
}
