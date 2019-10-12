package com.yao;

/**
 * 篮球游戏
 *
 * @author pengjie_yao
 * @date 2019/10/1114:21
 */
public class BasketBall extends Game {
    @Override
    void initialize() {
        System.out.println("初始化篮球游戏");
    }

    @Override
    void startPlay() {
        System.out.println("开始篮球游戏");
    }

    @Override
    void endPlay() {
        System.out.println("结束篮球游戏");

    }
}
