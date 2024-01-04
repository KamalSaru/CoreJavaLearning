package BasicJavaLearning.ForLoop;

import java.util.Arrays;

public class EvenNumber {
    public static void main(String[] args) {
        /*int [] arrayNumber=[20];
        for(int i=0; i<=arrayNumber.length; i++) {
            if(arrayNumber[i]%2==0) {
                System.out.println(arrayNumber[i]);
            }
        } */
        for(int i=1; i<=20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number are "+i);
            } else {
                System.out.println("Odd number are "+i);
            }
        }
    }
}
