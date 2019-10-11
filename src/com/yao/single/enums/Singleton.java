package com.yao.single.enums;

/**
 *  枚举方式创建单例模式
 *  线程安全
 *  这种方式是 Effective Java 作者 Josh Bloch 提倡的方式，
 *  它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化
 * @author pengjie_yao
 * @date 2019/10/1114:58
 */
public enum Singleton {
    /**
     *  单例对象
     */
    INSTANCE;
    public void whateverMethod(){
        System.out.println("枚举方式的创建单例模式");
    }
}
