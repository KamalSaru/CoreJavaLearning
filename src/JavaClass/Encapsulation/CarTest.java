package JavaClass.Encapsulation;

public class CarTest {
    // All the details pull from Car class if public
    public static void main(String[] args) {
        System.out.println(Car.num);
        System.out.println("\n");
        Car bmw=new Car("BMW", "Black", 78279.75f);
        bmw.displaydetails(bmw);

        System.out.println("\n");
        Car kia = new Car("Kia", "Red"); //default value print null,0.0 if not construction
        kia.displaydetails(kia);

        System.out.println("\n");
        Car mazda= new Car("White", 55000f);//default value print null,0.0 if not construction
        mazda.displaydetails(mazda);
    }
}
