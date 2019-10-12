package com.yao;

/**
 * @author pengjie_yao
 * @date 2019/10/1215:04
 */
public abstract class AbstractLogger {

    // 对应级别的状态
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    // 所设置的级别
    protected int level;

    /**
     *  责任链的下一个元素
     */
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        // 如果比设置的级别小，则说明要输出，比如最初设置的是INFO级别，
        // 然后传进来的参数是ERROR级别，很明显比INFO级别高，所以此时要输出信息
        if (this.level <= level) {
            write(message);
        }
        // 寻找下一个责任人
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    /**
     *  抽象的写日志信息
     * @param message
     */
    abstract protected void write(String message);
}
