import java.io.IOException;
import java.util.logging.*;

public class TestLogger {
    public static void main(String[] args) throws IOException{
        //日志记录器
        Logger log = Logger.getLogger("hello");
        log.setLevel(Level.INFO);

        Logger log1 = Logger.getLogger("hello");
        System.out.println(log == log1);

        Logger log2 = Logger.getLogger("hello logger");
        log2.setLevel(Level.INFO);

        //日志处理器(输出控制台)
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        //为日志处理器设置日志格式
        consoleHandler.setFormatter(new MyLogHandler());
        //注册日志处理器到日志记录器
        log.addHandler(consoleHandler);

        //日志处理器(输出到文件)
        FileHandler fileHandler = new FileHandler("/Users/liuyi/testlog.log");
        fileHandler.setLevel(Level.ALL);
        log2.addHandler(fileHandler);
        fileHandler.setFormatter(new MyLogHandler());
        //记录日志信息
        log.info("aaaa");
        log1.info("bbbb");
        log2.warning("fine");

    }
}

class MyLogHandler extends Formatter{
    @Override
    public String format(LogRecord logRecord){
        return logRecord.getLevel()+":"+logRecord.getMessage()+"\n";
    }
}
