package BasicJavaLearning.BranchingStatement;

import java.util.Scanner;

public class IfElseStatement {  //in the conditions
    public static void main (String[] args) {
        Scanner scanner= new Scanner((System.in));
        System.out.println("Enter the number : ");
        int num1 = scanner.nextInt();

        if(num1>0) {
            System.out.println("The number positive.");
        } else if(num1<0) {
            System.out.println("The number is negative.");
        } else {       //at the end no need num value due to end
            System.out.println("The number is neither positive nor negative.");
        }
    }

}
