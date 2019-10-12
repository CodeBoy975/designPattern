package com.yao;

import com.yao.Interface.ComputerPart;

/**
 * @author pengjie_yao
 * @date 2019/10/1216:37
 */
public class Monitor  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
