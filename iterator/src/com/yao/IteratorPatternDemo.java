package com.yao;

import com.yao.Interface.Iterator;

/**
 *  迭代器模式
 * @author pengjie_yao
 * @date 2019/10/1216:14
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext(); ) {
            String name = (String) iterator.next();
            System.out.println("名字为:" + name);
        }
    }
}
