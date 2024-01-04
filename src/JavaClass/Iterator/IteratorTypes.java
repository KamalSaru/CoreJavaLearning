package JavaClass.Iterator;

import java.util.*;

public class IteratorTypes {
    public static void main(String[] args) {
        Vector<String>animalNames=new Vector<>();
        animalNames.add("Cow");
        animalNames.add("Dog");
        animalNames.add("Goat");

        List<Integer>nums=new LinkedList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        ListIterator iterator=nums.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("***********************************");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        System.out.println();
        Enumeration enumeration=animalNames.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
