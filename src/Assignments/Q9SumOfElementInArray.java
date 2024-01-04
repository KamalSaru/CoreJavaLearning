package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

//Program to find the sum of all elements in an array.*****************************************
public class Q9SumOfElementInArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Float> arrayNumberList=new ArrayList<>();
        System.out.print("please enter the total number of array list :- ");
        int totalArrayNumberList= scanner.nextInt();

        for(int i=0; i<totalArrayNumberList; i++) {
            System.out.print("Enter the number in the list :- ");
            float listOfNumber = scanner.nextFloat();
            arrayNumberList.add(listOfNumber);
        }
        double totalSumOfArrayList=arrayNumberList.stream().mapToDouble(number->number).sum();
        System.out.println("The sum of the array list number is:- "+totalSumOfArrayList);
    }
}
