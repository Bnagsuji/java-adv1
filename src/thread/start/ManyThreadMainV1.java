package thread.start;

import static util.MyLogger.log;

public class ManyThreadMainV1 {
    public static void main(String[] args) {
        log("main() start");

        HelloRunnable runnable = new HelloRunnable();

        log("thread1() start");
        Thread thread1 = new Thread(runnable);
        thread1.start();

        log("thread1() end");
        log("thread2() start");
        Thread thread2 = new Thread(runnable);
        thread2.start();
        log("thread2() end");

        log("main() end");

    }
}
