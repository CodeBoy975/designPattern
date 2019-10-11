package com.yao.abstractfactory;

import com.yao.abstractfactory.Interface.Color;

/**
 * @author pengjie_yao
 * @date 2019/10/1110:51
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("抽象工厂模式——填充的是蓝色");
    }
}
