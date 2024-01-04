package CollectionFrameWork;

import java.util.List;

public class CarDetails {
    String carBrandName;
    String carTypeName;
    String color;
    int vinNumber;
    int year;
    float price;
    float tax;
    float destinationCharge;
    List<String>cars;

public  CarDetails(String carBrandName, String carTypeName, int vinNumber, int year, float price, List<String>cars){
    this.carBrandName=carBrandName;
    this.carTypeName=carTypeName;
    this.vinNumber=vinNumber;
    this.year=year;
    this.price=price;
    this.cars=cars;
   }
public String getCarBrandName(){return carBrandName;}
public void setCarBrandName(String carBrandName){
    this.carBrandName=carBrandName;}
public String getCarTypeName(){return carTypeName;}
public void setCarTypeName(String carTypeName){
    this.carTypeName=carTypeName;}
public String getColor(){return color;}
public void setColor(String color){
    this.color=color;}

    public void displayCarDetails(){
        System.out.println(carBrandName);
        System.out.println(carTypeName);
        System.out.println(color);
    }
}
