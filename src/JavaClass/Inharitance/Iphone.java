package JavaClass.Inharitance;

public class Iphone extends Mobile{    //child class own method
    float originalPrice=1099f;
    float offerDiscount =200f;  //$200 off
    float price =originalPrice-offerDiscount;

    public static void main(String[] args) {
        Iphone iphone=new Iphone();
        iphone.setName("Iphone Pro Max");
        iphone.setVersion("Version14");
        iphone.setColor("Gold");
        iphone.setPrice(iphone.price); //Discount price
        iphone.displayDetails();

        //System.out.println(iphone.getName());
        //System.out.println(iphone.getColor());

    }
}
