package com.yao;

/**
 * 文件级别的日志
 *
 * @author pengjie_yao
 * @date 2019/10/1215:08
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("文件日志记录为：" + message);
    }
}
