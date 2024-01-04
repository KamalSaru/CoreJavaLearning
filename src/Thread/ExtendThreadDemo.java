package Thread;

public class ExtendThreadDemo extends Thread {
    public static void main(String[] args) {
        ExtendThreadDemo thread = new ExtendThreadDemo();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
