package util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class MyLogger {
    //추상클래스는 직접 생성할 수 없다.

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss:SSS");
    public static void log(Object obj) {
         String time =  LocalTime.now().format(formatter);
         //%9s : 9칸 고정
         System.out.printf("%s [%9s] %s\n", time, Thread.currentThread().getName(), obj);
    }
}
