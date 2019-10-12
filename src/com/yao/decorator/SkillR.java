package com.yao.decorator;

import com.yao.decorator.Interface.Hero;

/**
 * R技能
 *
 * @author pengjie_yao
 * @date 2019/10/129:08
 */
public class SkillR extends Skills {

    private String skillName;

    public SkillR(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    /**
     * 重写技能方法
     */
    @Override
    public void learnSkills() {
        System.out.println("学习了技能R:" + skillName);
        super.learnSkills();

    }
}
