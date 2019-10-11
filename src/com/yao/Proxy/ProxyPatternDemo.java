package com.yao.Proxy;

/**
 *  菜鸟笔记例子
 * @author pengjie_yao
 * @date 2019/10/1117:03
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        // 创建代理对象
        Image image = new ProxyImage("a.jpg");

        System.out.println("第一次则从磁盘加载图片");
        image.display();
        System.out.println("第二次则不需要从磁盘加载图片");
        image.display();
    }
}
