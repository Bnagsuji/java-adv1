package thread.start;

public class HelloThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " : main start"); // 자바가 만들어주는 기본 쓰레드 실행

        HelloThread thread1 = new HelloThread();
        System.out.println(Thread.currentThread().getName() + " : hello Thread 호출 전");
        thread1.start(); //run()? start()? 반드시 start호출
        System.out.println(Thread.currentThread().getName() + " : hello Thread 호출 후");
        System.out.println(Thread.currentThread().getName() + " : hello Thread 호출 후");


        System.out.println(Thread.currentThread().getName() + " : main end");
    }
}
