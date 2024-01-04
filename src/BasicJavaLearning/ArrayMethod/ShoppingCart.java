package BasicJavaLearning.ArrayMethod;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String [] itemOfFruits = {"Apple", "Grapes", "Banana", "Orange", "Strawberry", "Pineapple",
                "Fruitcake", "cherry", "Mango", "peach"};

        System.out.println("The total items of fruit is "+ itemOfFruits.length+".");
        System.out.println("The fruit name is "+itemOfFruits[0]+".");

        System.out.print("Please enter the fruit price : " );
        float price=scanner.nextFloat();
        System.out.print("please, enter the weight of the fruit in lb : " );
        float weightOfFruit = scanner.nextFloat();
        float totalCoat= price*weightOfFruit;
        System.out.println("The total cost of the apple is $"+totalCoat+".");

    }
}
