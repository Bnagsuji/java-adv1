package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV4 {
    public static void main(String[] args) {
        log("main() start");

        //익명 클래스 직접 전달 사용
        //ctrl+alt+v >

        //alt + enter > 추천 구문
        Thread thread = new Thread(() -> log("run()"));
        thread.start();


        log("main() end");
    }


}
