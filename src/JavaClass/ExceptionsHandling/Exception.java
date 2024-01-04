package JavaClass.ExceptionsHandling;

//Runtime error-developer mistake
//Compile error-error from the program wrong before run

public class Exception {
    public static void main(String[] args) {
        String name=null;
        try {
            System.out.println(10 / 0);
            System.out.println("New Line");
            System.out.println(name.length());

        } catch (ArithmeticException e){
            e.printStackTrace();  //exception error tracker
            System.out.println("Arithmetic Exception Occurred."+e.getMessage());  //Exception error message
        }catch (NullPointerException e){
            System.out.println("NullPointerException Occurred.");
        } finally {
            System.out.println("Inside finally.");
        }
        System.out.println("After finally block.");
    }
}
