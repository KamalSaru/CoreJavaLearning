package BasicJavaLearning.ArrayMethod;

public class TestOfArray { //Single dimension of array
    public static void main(String[] args) {
        String cars[]= new String[5]; //declaration and instantiate
        cars[0] ="BMW";
        cars[1] ="Mazda";
        cars[2] ="Ford";
        cars[3] ="Toyota";
        cars[4] ="Honda";
        System.out.println("Total brand choice of cars is "+ cars.length+"."); // Total number of cars
        for (int i =0; i< cars.length; i++)
            System.out.println(cars[i]); //Print cars list
        System.out.println("My best car is "+cars[0]+"."); //print the selected car

    }
}
