package com.yao;


import com.yao.Interface.Color;

/**
 * @author pengjie_yao
 * @date 2019/10/1110:51
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("抽象工厂模式——填充的是红色");
    }
}
