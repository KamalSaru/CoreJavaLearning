package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarDisplay {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please Enter the customer name :- ");
        String customerName=scanner.nextLine();

        System.out.print("Please enter the total number of car brand:- ");
        int numberOfCarBrand=scanner.nextInt();

        System.out.print("Please enter your car brand name : ");
        String carBrandName=scanner.nextLine();

        List<String > customerNames = new ArrayList<>();
        customerNames.add("Kamal Saru");
        customerNames.add("John Sen");
        customerNames.add("George Olivia");
        customerNames.add("Emily Miller ");
        customerNames.add("Justin viber");

        List<String> carBrand = new ArrayList<>();
        carBrand.add("BMW");
        carBrand.add("Porch");
        carBrand.add("Ford");
        carBrand.add("Mazda ");
        carBrand.add("Audi");

    }
}
