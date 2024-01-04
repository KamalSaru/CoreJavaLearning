package JavaClass.HasSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHasSet {
    public static void main(String[] args) {
        Set<String> countryNames=new LinkedHashSet<>();
        countryNames.add("Nepal");
        countryNames.add("Nepal");
        countryNames.add("China");
        countryNames.add("USA");
        countryNames.add("Canada");
        countryNames.add("Canada");
        countryNames.add("india");
        countryNames.add("China");

        System.out.println(countryNames.contains("Australia"));
        Iterator iterator=countryNames.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
