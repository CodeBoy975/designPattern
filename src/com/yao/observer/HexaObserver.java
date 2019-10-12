package com.yao.observer;

/**
 *  十六进制
 * @author pengjie_yao
 * @date 2019/10/1116:01
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        // 将主题加入观察者中
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("十六进制为：" + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
