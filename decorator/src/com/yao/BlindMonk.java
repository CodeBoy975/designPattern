package com.yao;


import com.yao.Interface.Hero;

/**
 * 盲僧
 *
 * @author pengjie_yao
 * @date 2019/10/129:06
 */
public class BlindMonk implements Hero {

    /**
     * 名字
     */
    private String name;

    public BlindMonk(String name) {
        this.name = name;
    }

    @Override
    public void learnSkills() {
        System.out.println(name + "学习了以上技能");
    }
}
