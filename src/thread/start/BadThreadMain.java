package thread.start;

public class BadThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " : main start"); // 자바가 만들어주는 기본 쓰레드 실행

        HelloThread thread1 = new HelloThread();
        System.out.println(Thread.currentThread().getName() + " : hello Thread 호출 전");
        thread1.run(); //run() 호출시 새로운 쓰레드가 실행되는 게 아니라 main쓰레드가 실행한다.
        System.out.println(Thread.currentThread().getName() + " : hello Thread 호출 후");
        System.out.println(Thread.currentThread().getName() + " : hello Thread 호출 후");


        System.out.println(Thread.currentThread().getName() + " : main end");
    }
}
