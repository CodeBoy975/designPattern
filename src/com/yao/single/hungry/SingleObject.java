package com.yao.single.hungry;

/**
 * 饿汉模式
 * 线程安全
 *
 * @author pengjie_yao
 * @date 2019/10/1114:44
 */
public class SingleObject {

    /**
     *  一开始就初始化对象,volatile则保证可见性
     */
    private static volatile SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance() {
        return instance;
    }

}
