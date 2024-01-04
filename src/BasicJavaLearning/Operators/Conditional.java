package BasicJavaLearning.Operators;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args){
        Scanner scanner=new Scanner((System.in));
        System.out.println("Please enter the number : ");
        int num1= scanner.nextInt();
        /*if(num1>0) {
            System.out.println("Number is positive.");
        } else if (num1<0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is neither.");
        }*/
        if(num1%2==0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }
        //Ternary/Conditional operator
        //Condition ? True Expression : False  Expression
        String result =num1%2==0 ?"Number is even." : "Number is odd.";
        System.out.println(result);

    }
}
