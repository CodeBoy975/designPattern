package com.yao.proxy;

/**
 *  图片实现，这里的代理，当第一次没有的时候去加载后返回；当第二次加载的时候，则不需要去磁盘加载。
 * @author pengjie_yao
 * @date 2019/10/1116:54
 */
public class ProxyImage implements Image {

    /**
     *  文件名
     */
    private String fileName;

    /**
     *  代理的对象
     */
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public void display() {
        if (realImage == null) {
            // 加载所对象的对象
            realImage = new RealImage(fileName);
        }
        realImage.display();

    }
}
