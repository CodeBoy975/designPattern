package com.yao.Interface;

/**
 *  迭代器接口
 * @author pengjie_yao
 * @date 2019/10/1216:11
 */
public interface Iterator {

    /**
     *  判断是否有下一个元素
     * @return
     */
    public boolean hasNext();

    /**
     *  获取元素
     * @return
     */
    public Object next();
}
