package JavaClass.Constructor;

public class Parameters {
    int modelYear;
    String modelName;

    public Parameters(int year, String name) {  //same class name "Parameters"
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Parameters myCar = new Parameters(1969, "Mustang"); //same class name "Parameters"
        System.out.println(myCar.modelYear + " " + myCar.modelName);

    }
}
