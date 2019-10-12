package com.yao;


import com.yao.Interface.Item;

import java.util.ArrayList;
import java.util.List;

/**
 *  菜单
 * @author pengjie_yao
 * @date 2019/10/1212:10
 */
public class Meal {

    private List<Item> itemList = new ArrayList<>();

    /**
     *  增加食物
     * @param item
     */
    public void addItem(Item item) {
        itemList.add(item);
    }

    /**
     *  计算套餐总金额
     * @return
     */
    public float getCost(){
        float cost = 0.0f;
        for (Item item : itemList) {
            cost += item.price();
        }
        return cost;
    }

    /**
     *  显示套餐对应的食物
     */
    public void showItems(){
        for (Item item : itemList) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }

}
