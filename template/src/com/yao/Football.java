package com.yao;

/**
 * @author pengjie_yao
 * @date 2019/10/1114:22
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("初始化足球游戏");
    }

    @Override
    void startPlay() {
        System.out.println("开始足球游戏");
    }

    @Override
    void endPlay() {
        System.out.println("结束足球游戏");
    }
}
