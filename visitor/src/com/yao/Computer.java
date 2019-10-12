package com.yao;

import com.yao.Interface.ComputerPart;

/**
 * @author pengjie_yao
 * @date 2019/10/1216:38
 */
public class Computer implements ComputerPart {

    /**
     * 存放电脑组成部分数据
     */
    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        // 遍历出电脑中组成部分
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
