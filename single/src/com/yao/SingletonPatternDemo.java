package com.yao;


import com.yao.enums.Singleton;

/**
 * 单例模式
 *
 * @author pengjie_yao
 * @date 2019/10/1114:38
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingleObject instance = SingleObject.getInstance();
        instance.showMessage();
        System.out.println("枚举方式的创建");
        Singleton enumSingleTon = Singleton.INSTANCE;
        enumSingleTon.whateverMethod();
    }
}
