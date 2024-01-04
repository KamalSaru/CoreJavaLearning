package JavaClass.StreamAPI;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> fruits=List.of("Mango", "apple", "Banana", "Avocado", "Apricot");
        //converting string to uppercase
        fruits=fruits.stream().map(fruit->fruit.toUpperCase()).collect(Collectors.toList());

        //find word with the letter A
        fruits.stream().filter(fruit->fruit.toUpperCase().startsWith("A")).forEach(f-> System.out.println(f));

        //finding square of number using stream
        System.out.println();
        List<Integer> number=List.of(1,2,3,4,5);
        number.stream().map(num->num*num).forEach(square-> System.out.println(square));
        number.stream().filter(num->num>3).forEach(n-> System.out.println(n));
        System.out.println();

        //find sum of all number using stream
        System.out.println(number.stream().reduce(0,(n1,n2)->n1+n2));
        //Find the product of all number using stream
        System.out.println(number.stream().reduce(1,(n1,n2)->n1*n2));

        System.out.println(number.stream().allMatch(num->num>1));//true
        System.out.println(number.stream().allMatch(num->num>3));//false
        System.out.println(number.stream().anyMatch(num->num>4));//true
        System.out.println(number.stream().noneMatch(num->num>9));//true

        List<Integer>nums=List.of(12,43,45);



        Iterator fruitIterator=fruits.iterator();
        while (fruitIterator.hasNext()) {
            System.out.println(fruitIterator.next());
        }
    }
}
