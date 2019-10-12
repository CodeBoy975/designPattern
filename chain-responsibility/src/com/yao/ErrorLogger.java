package com.yao;

/**
 * ERROR级别的日志
 *
 * @author pengjie_yao
 * @date 2019/10/1215:08
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("错误日志记录为：" + message);
    }
}
