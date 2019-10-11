package com.yao.Observer;

/**
 * @author pengjie_yao
 * @date 2019/10/1116:01
 */
public abstract class Observer {

    protected Subject subject;
    public abstract void update();
}
