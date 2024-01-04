package BasicJavaLearning.ArrayMethod;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        String [] items = {"Watch", "Mobile", "Laptop", "Wallet","Umbrella", "T-Shirt", "Phone Charger", "Pencil", "Note Copy", "Books" };
        //int [] itemsQuantity= { 10, 15, 17, 13,22,27,32,9,14,23};
        //double [] itemPrice = {17.7,18.5,21.5,11.2,13.2,7.8,9.5,17.5,8.5,5.3};

        //Arraylist<String>items =new ArrayList<String>();
        System.out.println("Total number of the items is " +items.length+".");
        Scanner scanner= new Scanner(System.in);
        System.out.print("Select the item which you like: ");
        String item = scanner.nextLine();
        System.out.println("Please, select the item : " +item);

        System.out.print("Enter your quantity : ");
        int quantity = scanner.nextInt();
        System.out.println("Requested quantity is : " +quantity);

        System.out.print("Enter the price of the item : ");
        double price =scanner.nextDouble();
        System.out.println("Price of the item is :$"+price);
        double cost = quantity*price;
        System.out.println("The total cost of the items :$"+cost);

    }
}

