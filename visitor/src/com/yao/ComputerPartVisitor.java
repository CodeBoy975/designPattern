package com.yao;

/**
 * @author pengjie_yao
 * @date 2019/10/1216:38
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
