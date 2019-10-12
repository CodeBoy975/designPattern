package com.yao;

import com.yao.decorator.Interface.Hero;

/**
 * W技能
 *
 * @author pengjie_yao
 * @date 2019/10/129:08
 */
public class SkillW extends Skills {

    private String skillName;

    public SkillW(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    /**
     * 重写技能方法
     */
    @Override
    public void learnSkills() {
        System.out.println("学习了技能W:" + skillName);
        super.learnSkills();

    }
}
