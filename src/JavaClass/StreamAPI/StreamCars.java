package JavaClass.StreamAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

    class Cars {
        String name;
        String color;
        float price;
        int year;
        int mileage;

        public Cars(String name, String color, float price, int year, int mileage) {
            this.name = name;
            this.color = color;
            this.price = price;
            this.year = year;
            this.mileage = mileage;
        }
        @Override//Print all the iterator objects
        public String toString() {
            return "cars{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    ", price=" + price +
                    ", year=" + year +
                    ", mileage=" + mileage +
                    '}';
        }
    }
    public class StreamCars {
    public static void main(String[] args) {
        //List<String> cars = List.of("BMW", "Porsche", "Mercedes", "Alfa", "Ford", "Audi", "Acura", "Buick", "Cadillac", "Jaguar", "Kia", "Lexus", "Maserati", "Lincoln");

        List<Cars>carsList=new ArrayList<Cars>();
        carsList.add(new Cars("BMW","Black",78725.96f, 2023, 23));
        carsList.add(new Cars("Porsche","Red",92578.25f, 2022, 18));
        carsList.add(new Cars("Mercedes","White",83789.95f, 2024, 27));
        carsList.add(new Cars("Alfa","Gray",79825.64f, 2023, 17));
        carsList.add(new Cars("Ford","Blue",58725.96f, 2021, 29));
        carsList.add(new Cars("Audi","Black",68789.86f, 2022, 21));
        carsList.add(new Cars("Kia","Alpine",52786.45f, 2024, 32));

        System.out.println("###--------------------------------------------------------------------------------------------###");
        System.out.println("Total brand of cars are " +carsList.size()+".");
        carsList.stream().filter(car->car.price<78000).forEach(car-> System.out.println("The car price less than $78000 are "+car.name+" price is " +car.price+"."));

        System.out.println();//filter the car base on price
        carsList.stream().filter(car -> car.price>=78000).forEach(car-> System.out.println("The care price more than $78000 are "+car.name+ " price is " +car.price+"."));

        System.out.println();//count the number of car based on price
        long count=carsList.stream().filter(cars -> cars.price<70000).count();
        System.out.println("The total car brand less than $70000 are "+count+" cars brand.");

        System.out.println();//Calculate total of the car price
        float totalPriceOfCars=carsList.stream().map(cars -> cars.price).reduce(0.00f,Float::sum);
        System.out.println("The total price of the seven cars is "+totalPriceOfCars+".");
        //carsList = carsList.stream().map(car -> car.toUpperCase()).collect(Collectors.toList());
        //carsList.stream().filter(car -> car.toUpperCase().startsWith("A")).forEach(car-> System.out.println(car));

        System.out.println();
        Iterator carsListIterator = carsList.listIterator();
        while (carsListIterator.hasNext()) {
            System.out.println(carsListIterator.next());
        }
    }
}
