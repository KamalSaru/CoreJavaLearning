package Thread;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()); //main class name is main
        for (int i=1; i<=5; i++){
            Thread.sleep(1000);
            System.out.println("First loop "+i);
        }

        for (int i=1; i<=5; i++) {
            Thread.sleep(1000);
            System.out.println("Second loop " + i);
        }
    }
}
