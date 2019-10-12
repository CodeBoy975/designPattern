package com.yao.doublelock;

/**
 *  双重锁模式
 *   线程安全:这种方式采用双锁机制，安全且在多线程情况下能保持高性能
 * @author pengjie_yao
 * @date 2019/10/1114:46
 */
public class Singleton {

    private volatile static Singleton instance;
    private Singleton() {}

    public static Singleton getInstance(){
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
