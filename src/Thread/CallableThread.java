package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableThread implements Callable {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        CallableThread callableThread=new CallableThread();
        System.out.println(Thread.currentThread().getName()+" Main thread is continuing its works..");

    }
    public String call() throws Exception{
        Thread.sleep(5000);//pause program execution for 5 second
        return Thread.currentThread().getName();
    }
}
