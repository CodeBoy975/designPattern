package com.yao;

/**
 * 最基本的单例模式
 *  线程不安全
 * @author pengjie_yao
 * @date 2019/10/1114:35
 */
public class SingleObject {

    /**
     *  创建一个单例对象
     */
    private static SingleObject instance = new SingleObject();

    /**
     *  让构造器函数未private，不允许外部初始化
     */
    private SingleObject(){}

    /**
     *  获取唯一可用的对象
     * @return
     */
    public static SingleObject getInstance() {
        return instance;
    }
    public void showMessage() {
        System.out.println("This is showMessage");
    }
}
