package com.yao.strategyDemo;

import com.yao.strategyDemo.Interface.Strategy;

/**
 * @author pengjie_yao
 * @date 2019/10/1111:39
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 执行对应的运算
     *
     * @param num1
     * @param num2
     * @return
     */
    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }

}
