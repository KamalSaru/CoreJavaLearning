package JavaClass.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String , String> countryCapital=new HashMap<>();
        countryCapital.put("Nepal", "Kathmandu");
        countryCapital.put("China", "Beijing");
        countryCapital.put("USA", "DC");

        System.out.println(countryCapital.get("USA"));
        System.out.println(countryCapital.containsKey("China"));
        System.out.println(countryCapital.containsValue("DC"));
        //countryCapital.remove("China");
        System.out.println(countryCapital.isEmpty());

        for(Map.Entry cc:countryCapital.entrySet()){
            System.out.println("Country is "+cc.getKey()+", Capital city is "+cc.getValue());
        }
        for (String key:countryCapital.keySet()){
            System.out.println(key);
        }
        System.out.println();
        for(String value: countryCapital.values()){
            System.out.println(value);
        }
    }
}
