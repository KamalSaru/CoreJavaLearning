package Thread.Practice;

public class ProgramC extends Thread{
    public void mc(){
        System.out.println("Program C enter........");
        long i=0;
        while (true) {
            i++;
            if(i%3000000==0)
                System.out.println("Program C end.");
            if(i==3000000);
            break;
        }
    }
}
