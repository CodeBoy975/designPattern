package com.yao.strategyDemo;

import com.yao.strategyDemo.Interface.Strategy;

/**
 * 乘法运算
 *
 * @author pengjie_yao
 * @date 2019/10/1111:37
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
