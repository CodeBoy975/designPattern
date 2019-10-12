package com.yao;

import com.yao.decorator.Interface.Hero;

/**
 * E技能
 *
 * @author pengjie_yao
 * @date 2019/10/129:08
 */
public class SkillE extends Skills {

    private String skillName;

    public SkillE(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    /**
     * 重写技能方法
     */
    @Override
    public void learnSkills() {
        System.out.println("学习了技能E:" + skillName);
        super.learnSkills();

    }
}
