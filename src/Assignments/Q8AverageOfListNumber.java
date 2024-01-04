package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

//Program to calculate the average of a list of numbers*****************************************
public class Q8AverageOfListNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Double>arrayNumberList=new ArrayList<>();
        System.out.print("please enter the total number of array list :- ");
        int totalArrayNumberList= scanner.nextInt();

        for(int i=0; i<totalArrayNumberList; i++){
            System.out.print("Enter the number in the list :- ");
            double listOfNumber= scanner.nextDouble();
            arrayNumberList.add(listOfNumber);
        }
        double averageOfArrayList=arrayNumberList.stream().mapToDouble(number->number).average().orElse(0);
        System.out.println("The average of the array list number is:- "+averageOfArrayList);
    }
}
