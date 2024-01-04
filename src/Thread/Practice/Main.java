package Thread.Practice;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main program entered.");
        ProgramA pa=new ProgramA();
        pa.ma();
        System.out.println("In main from program A");

        ProgramB pb=new ProgramB();
        pb.mb();
        System.out.println("In main from program B.");

        ProgramC pc=new ProgramC();
        pc.mc();
        System.out.println("In main program C.");
        System.out.println("Exit Main.");
    }
}
