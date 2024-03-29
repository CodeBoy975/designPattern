package com.yao;

/**
 * @author pengjie_yao
 * @date 2019/10/1116:01
 */
public abstract class Observer {

    protected Subject subject;

    /**
     *  更新订阅信息
     */
    public abstract void update();
}
