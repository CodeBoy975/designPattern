package com.yao.template;

/**
 * @author pengjie_yao
 * @date 2019/10/1114:23
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        System.out.println("篮球游戏");
        Game game = new BasketBall();
        game.play();
        System.out.println("足球游戏");
        game = new Football();
        game.play();
    }
}
