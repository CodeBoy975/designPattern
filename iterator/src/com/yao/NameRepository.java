package com.yao;

import com.yao.Interface.Container;
import com.yao.Interface.Iterator;

/**
 * @author pengjie_yao
 * @date 2019/10/1216:12
 */
public class NameRepository implements Container {

    public String[] names = {"小明", "小红", "小新"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    /**
     *  名字的迭代器
     */
    private class NameIterator implements Iterator {

        /**
         *  索引
         */
        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }

}
