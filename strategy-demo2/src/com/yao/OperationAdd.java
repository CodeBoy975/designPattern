package com.yao;


import com.yao.Interface.Strategy;

/**
 * 加法运算
 *
 * @author pengjie_yao
 * @date 2019/10/1111:37
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
