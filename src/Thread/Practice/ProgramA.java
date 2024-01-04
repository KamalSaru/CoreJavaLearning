package Thread.Practice;

public class ProgramA extends Thread{
    public void ma(){
        System.out.println("Program A enter........");
        long i=0;
        while (true) {
            i++;
            if(i%3000000==0)
                System.out.println("Program A end.");
            if(i==3000000);
            break;
        }
    }
}
