package com.yao;

/**
 *  INFO级别的日志
 * @author pengjie_yao
 * @date 2019/10/1215:08
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO日志记录为：" + message);
    }
}
