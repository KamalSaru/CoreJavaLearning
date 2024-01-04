package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

//Program to find the largest element in an array.***********************************
public class Q5LargestElementInArray {
    public static void main(String[] args) {
        List<Integer> arrayNumberList= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the total number in the array list :- ");
        int totalArrayListNumber=scanner.nextInt();
        for (int i=0; i<totalArrayListNumber; i++){
            System.out.print("Enter number in the list is :- ");
            int numbersList= scanner.nextInt();
            arrayNumberList.add(numbersList);
        }
        int largestNumber=arrayNumberList.stream().max(Integer::compare).get();

        System.out.println("The largest number in the array list is "+largestNumber+".");
    }
}
