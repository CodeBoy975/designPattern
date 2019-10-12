package com.yao;

/**
 *  图片实现
 * @author pengjie_yao
 * @date 2019/10/1116:54
 */
public class RealImage implements Image {

    /**
     *  文件名
     */
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    /**
     *  从磁盘加载图片
     * @param fileName
     */
    private void loadFromDisk(String fileName) {
        System.out.println("加载"+fileName);
    }

    @Override
    public void display() {
        System.out.println("显示："+fileName);
    }
}
