package JavaClass.ExceptionsHandling;

import java.util.Scanner;

public class ThrowDemo {
    //throw keyword is
    public static void throwException(int age) {
        if (age < 18) {
            throw new ArithmeticException(("Age must be equal to or greater than 18."));

        } else {
            System.out.println("Eligible to vote.");
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter your age");
        int age= sc.nextInt();
        ThrowDemo.throwException(age);

    }
}
