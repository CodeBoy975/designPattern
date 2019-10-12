package com.yao;

/**
 *  八进制
 * @author pengjie_yao
 * @date 2019/10/1116:01
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        // 将主题加入观察者中
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("八进制为:" + Integer.toOctalString(subject.getState()));
    }
}
