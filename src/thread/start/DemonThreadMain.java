package thread.start;

public class DemonThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+": main() start");

        DemonThread thread = new DemonThread();
        thread.setDaemon(true);
        thread.start();


        System.out.println(Thread.currentThread().getName()+": main() end");


    }

    static class DemonThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+": run()");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName()+": run() end");
        }
    }
}
