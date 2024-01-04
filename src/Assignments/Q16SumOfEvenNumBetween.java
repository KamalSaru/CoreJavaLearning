package Assignments;

import java.util.Scanner;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

//Program to find the sum of all even numbers between 1and 100*****************
public class Q16SumOfEvenNumBetween {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the beginning number :- ");
        int begNumber= scanner.nextInt();
        System.out.print("Enter the ending number :- ");
        int endNumber= scanner.nextInt();

        //logic to check if the number is even or not
        //if i%2 is equal to zero, the number is even
        int evenNumSum=0;
        for (int i=begNumber; i<=endNumber; i++){
            if(i%2==0){
                evenNumSum+=i;  //evenNumSum=evenNumSum+i
            }
        }
        System.out.println("The sum of the even number between "+begNumber +" to "+endNumber +" is " +evenNumSum+".");
    }
}
