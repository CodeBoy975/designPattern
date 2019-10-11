package com.yao.template;

/**
 * 抽象的游戏类
 *
 * @author pengjie_yao
 * @date 2019/10/1114:19
 */
public abstract class Game {

    /**
     * 初始化
     */
    abstract void initialize();

    /**
     * 开始游戏
     */
    abstract void startPlay();

    /**
     * 结束游戏
     */
    abstract void endPlay();

    /**
     * 模板
     */
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
