package CollectionFrameWork;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> countryNames=new ArrayList<>();
        countryNames.add("Nepal");
        countryNames.add("USA");
        countryNames.add("Australia");

        List<String>secondCountryNameList=new ArrayList<>();
        secondCountryNameList.add("India");
        secondCountryNameList.add("China");
        secondCountryNameList.add("Canada");

        //countryNames.addAll(secondCountryNameList);
        System.out.println(countryNames.size());

        //for loop
        for (int i=0; i<countryNames.size(); i++){
            System.out.println(countryNames.get(i));
        }
        //for each
        for(String country:countryNames){
            System.out.println(country);
        }
        //removing country name
        countryNames.remove("Nepal");

        Iterator countryIterator=countryNames.iterator();
        while ((countryIterator.hasNext()));{
            System.out.println(countryIterator.next());
        }
        System.out.println(countryNames.get(1)); //random access selection

    }
}
