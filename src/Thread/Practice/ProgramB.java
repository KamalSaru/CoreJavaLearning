package Thread.Practice;

public class ProgramB extends Thread{
    public void mb(){
        System.out.println("Program B enter........");
        long i=0;
        while (true) {
            i++;
            if(i%3000000==0)
                System.out.println("Program B end.");
            if(i==3000000);
            break;
        }
    }
}
