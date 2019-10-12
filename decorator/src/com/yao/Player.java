package com.yao;


import com.yao.Interface.Hero;

/**
 * @author pengjie_yao
 * @date 2019/10/129:11
 */
public class Player {

    public static void main(String[] args) {
        Hero hero = new BlindMonk("李青");
        Skills skills = new Skills(hero);
        Skills r = new SkillR(skills,"猛龙摆尾");
        Skills e = new SkillW(r,"天雷破/摧筋断骨");
        Skills w = new SkillR(e,"金钟罩/铁布衫");
        Skills q = new SkillR(w,"天音波/回音击");

        q.learnSkills();

    }
}
