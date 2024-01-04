package JavaClass.Inharitance;

public class Main extends Mobile {
    public static void main(String[] args) {
        Iphone iphone=new Iphone();
        iphone.displayDetails();

        Samsung samsung=new Samsung();
        samsung.displayDetails();
    }
}
