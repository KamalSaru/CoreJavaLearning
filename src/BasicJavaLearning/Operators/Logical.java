package BasicJavaLearning.Operators;

public class Logical {
    public static void main(String[] args) {
        byte num1, num2;
        num1 = 10;
        num2 = 5;
        System.out.println(num1 > num2 && num1 == num2); //true && false
        System.out.println(num1 > num2 || num1 == num2); //true || false

        System.out.println(num1 >num2); //true
        System.out.println(!(num1 > num2)); //false
    }
}
