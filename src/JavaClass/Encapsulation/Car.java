package JavaClass.Encapsulation;

//Encapsulation, is to make sure that "sensitive" data is hidden from users
//declare class variables/attributes as private
//provide public get and set methods to access and update the value of a private variable
//The get method returns the variable value, and the set method sets the value.
//Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case
public class Car {
        String name;
        String color;
        float price;
        public static int num=20;

        public Car(){
        }

        public void displaydetails(Car bmw) { //public we can print in CarTest
        }


        public Car(String name, String color, float price) {   //private can not print in CarTest
            this.name = name;
            this.color = color;
            this.price = price;
        }

        public Car(String name, String color){
            this.name=name;
            this.color=color;
        }

        public Car(String color, float price){
            this.color=color;
            this.price=price;
        }

        public static void main(String[] args) {
            Car bmw=new Car("BMW", "Black", 78279.75f);
            System.out.println("\nBMW details");
            System.out.println(bmw.name);
            System.out.println(bmw.color);
            System.out.println(bmw.price);
            bmw.displaydetails(bmw);

            Car kia = new Car("Kia", "Red");
            System.out.println("\nKia details");
            System.out.println(kia.name);        //\n next line character
            System.out.println(kia.color);
            kia.displaydetails(kia);

            Car mazda= new Car("White", 55000f);
            System.out.println("\nMazda details");
            System.out.println(mazda.color);
            System.out.println(mazda.price);
            mazda.displaydetails(mazda);
        }
}
