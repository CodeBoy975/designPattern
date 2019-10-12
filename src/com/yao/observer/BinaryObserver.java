package com.yao.observer;

/**
 *  二进制
 * @author pengjie_yao
 * @date 2019/10/1116:01
 */
public class BinaryObserver extends Observer {


    public BinaryObserver(Subject subject) {
        this.subject = subject;
        // 订阅
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("二进制为:" + Integer.toBinaryString(subject.getState()));
    }
}
