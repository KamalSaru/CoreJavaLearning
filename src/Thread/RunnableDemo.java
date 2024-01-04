package Thread;

public class RunnableDemo implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "First loop " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        RunnableDemo demo1 = new RunnableDemo();
        Thread thread = new Thread(demo1, "Child thread");
        //demo1.start();

        for (int i = 1; i <= 10; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + "Second loop" + i);
        }
    }
}


