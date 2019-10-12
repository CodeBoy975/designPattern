package com.yao.Interface;

import com.yao.ComputerPartVisitor;

/**
 *  电脑组成部分
 * @author pengjie_yao
 * @date 2019/10/1216:36
 */
public interface  ComputerPart {

    /**
     *  接受访问者
     * @param computerPartVisitor
     */
    public void accept(ComputerPartVisitor computerPartVisitor);
}
