package com.yao;

import com.yao.Interface.ComputerPart;

/**
 * @author pengjie_yao
 * @date 2019/10/1216:39
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
