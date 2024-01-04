package JavaClass.Constructor;



//A constructor in Java is a special method that is used to initialize objects
//The constructor is called when an object of a class is created
//It can be used to set initial values for object attributes
//Note that the constructor name must match the class name
//it cannot have a return type (like void)
//Also note that the constructor is called when the object is created

import java.util.SortedMap;

public class Fruit {
    String name;
    String color;
    String taste;
    float price;
    float weight;

    public Fruit(String name, String color, String taste, float price) {
        this.name = name;
        this.color = color;
        this.taste = taste;
        this.price = price;
    }
    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public Fruit(String name, float weight, float price){
        this.name=name;
        this.weight=weight;
        this.price=price;
    }

    public static void main(String[] args) {
        Fruit banana=new Fruit("Banana", "yellow", "sweet",1.99f);
        System.out.println("Banana Details");
        System.out.println(banana.name);
        System.out.println(banana.color);
        System.out.println(banana.taste);
        System.out.println(banana.price);

        Fruit mango=new Fruit("Mango", 2.75f, 1.99f);
        System.out.println("\nMango Details");
        System.out.println(mango.name);
        System.out.println(mango.weight);
        System.out.println(mango.price);

        Fruit apple =new Fruit("Apple", "Red");
        System.out.println("\nApple details");
        System.out.println(apple.name);
        System.out.println(apple.color);
    }
}
