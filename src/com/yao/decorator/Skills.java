package com.yao.decorator;

import com.yao.decorator.Interface.Hero;

/**
 * 技能栏
 *
 * @author pengjie_yao
 * @date 2019/10/129:07
 */
public class Skills implements Hero {

    /**
     *  持有英雄对象的接口
     */
    private Hero hero;

    public Skills(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void learnSkills() {
        if (hero != null) {
            hero.learnSkills();
        }
    }
}
