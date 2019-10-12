package com.yao.lazy;


/**
 *   懒汉模式
 *   线程安全
 * @author pengjie_yao
 * @date 2019/10/1114:39
 */
public class ThreadSingleton {

    private static ThreadSingleton instance;

    private ThreadSingleton(){}

    /**
     *  通过加锁来保证现场安全
     * @return
     */
    public static synchronized ThreadSingleton getInstance() {
        // 当使用时才进行加载
        if (instance == null) {
            instance = new ThreadSingleton();
        }
        return instance;
    }

}
