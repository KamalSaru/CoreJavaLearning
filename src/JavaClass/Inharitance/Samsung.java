package JavaClass.Inharitance;

public class Samsung extends Mobile {   //child class own method
    float originalPrice=999f;
    float discountPrice=199f;
    float price= originalPrice-discountPrice;

    public static void main(String[] args) {
        Samsung samsung=new Samsung();
        samsung.setName("Samsung Galaxy");
        samsung.setVersion("Galaxy 3D");
        samsung.setColor("Gray");
        samsung.setPrice(samsung.price);
        samsung.displayDetails();
        //System.out.println(samsung.getName());

    }
}
