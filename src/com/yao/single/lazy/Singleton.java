package com.yao.single.lazy;


/**
 *   懒汉模式
 *   线程不安全
 * @author pengjie_yao
 * @date 2019/10/1114:39
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance() {
        // 当使用时才进行加载
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
