package Thread;

public class ConcurrencyThread extends Thread{
    public static int amount = 0;

    public static void main(String[] args) {
        ConcurrencyThread thread = new ConcurrencyThread();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    public void run() {
        amount++;
    }
}
