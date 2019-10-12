package com.yao.features;


import com.yao.features.Interface.QuackInterface;

/**
 * 描述： 吱吱叫
 *
 * @author pengjie_yao
 * @date 2019/9/12 8:59
 */
public class Squack implements QuackInterface {
    @Override
    public void quack() {
        System.out.println("我会吱吱叫");
    }
}
