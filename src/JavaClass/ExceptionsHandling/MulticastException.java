package JavaClass.ExceptionsHandling;

public class MulticastException {
    public static void main(String[] args) {

        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch(ArithmeticException e) //We can more than one catch
        {
            System.out.println("Arithmetic Exception occurs"+e.getMessage());
            e.printStackTrace();
            e.getLocalizedMessage();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        /*catch(Exception e) {
            System.out.println("Parent Exception occurs");
        }finally {
            System.out.println("rest of the code");
        }*/
    }
}
