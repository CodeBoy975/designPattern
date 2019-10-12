package com.yao;

/**
 * @author pengjie_yao
 * @date 2019/10/1116:05
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        // 对象订阅改subject
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("状态值改为: 15");
        subject.setState(15);
        System.out.println("状态值改为: 10");
        subject.setState(10);
    }
}
