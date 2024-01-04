package Assignments;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

import java.util.Scanner;

//Program to find the average of an array of numbers.*************************************
public class Q19AveOfArrayNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the size of array list :- ");
        int arrayListSize= scanner.nextInt();
        int[] arrayList= new int[arrayListSize]; //create arraylist objects
        int sumOfArrayList=0;
        float averageOfArrayListNumber=0.0f;

        for(int i=0; i<arrayListSize; i++){
            System.out.print("Enter the array list number:- ");
            arrayList[i] = scanner.nextInt();   //Enter the array list number
        }
        for (int i=0; i<arrayListSize; i++){
            sumOfArrayList += arrayList[i];  //sum of the array list
        }
        averageOfArrayListNumber=sumOfArrayList/arrayListSize; //average of the array list
        System.out.println("The average of the array list number is "+averageOfArrayListNumber+".");

    }
}
