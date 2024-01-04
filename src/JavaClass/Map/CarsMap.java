package JavaClass.Map;

import CollectionFrameWork.CarDetails;
import CollectionFrameWork.CarDisplay;

import java.util.*;

public class CarsMap {
    public static void main(String[] args) {
        Map<String, Double> carsNamePrice=new HashMap<>();
        carsNamePrice.put("BMW",75826.25);
        carsNamePrice.put("Audi", 68978.45);
        carsNamePrice.put("Ford", 52725.75);
        carsNamePrice.put("Porch", 89725.68);
        carsNamePrice.put("Lexus", 62535.95);

        System.out.println("Total brand of cars are "+carsNamePrice.size()+".");
        System.out.println("Is price "+carsNamePrice.containsValue(90000));
        System.out.println("This brand of car is available "+carsNamePrice.containsValue("Mazda"));
        System.out.println("Is this brand here "+carsNamePrice.containsKey("BMW"));
        //System.out.println(carsNamePrice.remove("Lexus", 62535.95));

        System.out.println();
        Set set=carsNamePrice.entrySet();
        Iterator iterator=set.iterator();
        while ((iterator.hasNext())){
            Map.Entry cp=(Map.Entry)iterator.next();
            System.out.println("Car brand name is "+cp.getKey()+" & price is "+cp.getValue()+".");
        }

        /*for (Map.Entry cp:carsNamePrice.entrySet()){
            System.out.println("Car brand name is "+cp.getKey()+" & price is "+cp.getValue()+".");
        }*/

        System.out.println();
        System.out.println("********* Name of cars brand *************");
        for (String cars: carsNamePrice.keySet()){
            System.out.println("Name of car brand is "+cars+'.');
        }
        System.out.println();
        System.out.println("*************Value of the cars ***********");
        for (Double price:carsNamePrice.values()){
            System.out.println("The price of the car is "+price+".");
        }
    }
    /*public class CarDetails{
        String name;
        String color;
        int model;
        short mileage;
        float price;
        float tax;
        float miCharge;

    public CarDetails(String name, String color, int model,short mileage, float price){
        this.name=name;
        this.color=color;
        this.model=model;
        this.mileage=mileage;
        this.price=price;
      }

        public String getName(String name){return name;}
        public void setName(String name){
        this.name=name;
        }
        public String getColor(String color){return color;}
        public void setColor(String color){
            this.color=color;
        }
        public int getModel(int model){return model;}
        public void setModel(int model){
            this.model=model;
        }
        public short getMileagePerGallon(short mileage){return mileage;}
        public void setMileagePerGallon(short mileage){
            this.mileage=mileage;
        }
        public float getPrice(float price){return price;}
        public void setPrice(float price){
            this.price=price;
        }
      public void CarDisplayDetails(){
          System.out.println(name);
          System.out.println(color);
          System.out.println(model);
          System.out.println(mileage);
          System.out.println(price);
      }
    }*/
}
