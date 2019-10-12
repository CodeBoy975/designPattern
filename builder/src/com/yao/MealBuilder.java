package com.yao;

/**
 *  套餐
 * @author pengjie_yao
 * @date 2019/10/1212:12
 */
public class MealBuilder {

    /**
     *  蔬菜套餐 = 蔬菜汉堡+可乐
     * @return
     */
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     *  鸡肉套餐=鸡肉汉堡+百事可乐
     * @return
     */
    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
