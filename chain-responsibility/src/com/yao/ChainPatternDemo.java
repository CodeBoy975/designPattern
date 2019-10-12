package com.yao;

/**
 *  责任链模式例子： 演示的是通过设置对应的级别，则会记录对应级别的日志。
 * @author pengjie_yao
 * @date 2019/10/1215:10
 */
public class ChainPatternDemo {

    /**
     *  获取所有日志
     * @return
     */
    private static AbstractLogger getChainOfLoggers() {

        // 设置对应的级别
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        // 形成链
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        // 设置为INFO日志才显示在控制台
        loggerChain.logMessage(AbstractLogger.INFO, "错误信息");

        System.out.println("======================");
        // 设置为DEBUG日志才显示在控制台，DEBUG日志会显示的为 文件日志以及INFO日志
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "错误信息");
        System.out.println("======================");

        // 设置为ERROR日志才显示在控制台
        loggerChain.logMessage(AbstractLogger.ERROR,
                "错误信息");
    }

}
