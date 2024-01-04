package JavaClass.Inharitance;

public class Mobile {
    private String name;
    private String version;
    private float price;
    private String color;

    public Mobile(){
        System.out.println("We are practice inheritance for extend the class. ");
    }

    public Mobile(String name, String version, String color, float price ){
        this.name=name;
        this.version=version;
        this.price=price;
        this.color=color;
    }
    public String getName() {
        return name;
    } //getName for wright
    public void setName(String name){ //in set put parameter with void, its only read
        this.name=name;
    }
    public String getVersion() {return version;}
    public void setVersion(String version) {
        this.version=version;
    }

    public String getColor(){return color;}
    public void setColor(String color){
        this.color=color;
    }
    public float getPrice(){return price;}
    public void setPrice(float price) {
        this.price=price;
    }

    public void displayDetails(){
        System.out.println(name);
        System.out.println(version);
        System.out.println(color);
        System.out.println(price);
    }

}
