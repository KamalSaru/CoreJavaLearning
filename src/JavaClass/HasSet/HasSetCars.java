package JavaClass.HasSet;
import java.util.*;
import java.util.Collection;

public class HasSetCars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter your car brand name:- ");
        String name=scanner.nextLine();

        //HashSet<String> cars = new HashSet<String>();
        Set< String> cars =new LinkedHashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Ford");
        //cars.clear();
        //cars.remove("Ford");
        //Collections.sort(cars);
        System.out.println("Mazda brand is available:- "+cars.contains("Mazda"));
        //System.out.println("");
        System.out.println("Total number of car brands:- "+cars.size());
        //System.out.println(cars);
        /*for (String i : cars){
            System.out.println(i);
        }*/
            if(cars.contains(name)){
                System.out.println(name + " was found int the cars dealer.");
            } else {
                System.out.println(name + " was not found in the car dealer.");
            }
        Iterator iterator= cars.iterator();
        System.out.println();
        System.out.println("List of cars".toUpperCase());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
