package BasicJavaLearning.Operators;

public class Relation {
    public static void main(String[] args) {
        byte num1, num2; //Declaration the value
        num1 = 10;  //Initialization
        num2 = 5;   //Initialization

        //Relation operation ---boolean.
        System.out.println(num1 == num2); //false
        System.out.println(num1 != num2);  //true
        System.out.println(num1 > num2);  //true
        System.out.println(num1 < num2);  //false
        System.out.println(num1 >= num2); //true
        System.out.println(num1 <= num2);  //false
    }
}
