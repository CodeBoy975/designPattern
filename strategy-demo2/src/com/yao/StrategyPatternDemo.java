package com.yao;

/**
 * 菜鸟笔记的策略模式学习
 *
 * @author pengjie_yao
 * @date 2019/10/1111:41
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        System.out.println("加法策略10+5");
        // 注入策略未加法运算
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(10, 5));

        System.out.println("减法策略10-5");
        // 注入减法策略


        context = new Context(new OperationSubstract());
        System.out.println(context.executeStrategy(10, 5));

        System.out.println("乘法策略10*5");
        // 注入乘法策略
        context = new Context(new OperationMultiply());
        System.out.println(context.executeStrategy(10, 5));
    }
}
