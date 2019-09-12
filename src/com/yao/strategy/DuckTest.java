package com.yao.strategy;

import com.yao.strategy.features.FlyRocketPowered;
import com.yao.strategy.features.MuteQuack;

/**
 * 描述： 策略模式测试例子
 *
 * @author pengjie_yao
 * @date 2019/9/12 9:06
 */
public class DuckTest {

    public static void main(String[] args) {
        // 1.绿头鸭，这里我们是在绿头鸭的构造器中赋予接口的实现类
        Duck duck = new MallardDuck();
        duck.display();
        duck.performQuack();
        duck.performFly();

        System.out.println("==================");
        // 2.模型鸭，这里通过动态改变赋予接口的实现类
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        System.out.println("动态修改飞行能力后");
        modelDuck.setFlyInterface(new FlyRocketPowered());
        modelDuck.performFly();

        System.out.println("==================");
        Duck redDuck = new RedheadDuck();
        redDuck.display();
        redDuck.setQuackInterface(new MuteQuack());
        redDuck.performFly();
        redDuck.performQuack();
    }
}
