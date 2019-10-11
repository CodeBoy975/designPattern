package com.yao.strategyDemo.Interface;

/**
 * 策略接口
 *
 * @author pengjie_yao
 * @date 2019/10/1111:36
 */
public interface Strategy {

    /**
     * 做运算
     *
     * @param num1
     * @param num2
     * @return
     */
    public int doOperation(int num1, int num2);
}
