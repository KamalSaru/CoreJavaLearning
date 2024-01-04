package JavaClass.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.SocketHandler;

public class CountCharacters {
    public static void main(String[] args) {
        String word ="MANNASESS";
        Map<Character, Integer> characterCount=new HashMap<>();
        //toCharArray convert yhe string into array of character
        for(Character ch: word.toCharArray()){
            if(characterCount.containsKey(ch)){
                //already added character
                characterCount.put(ch, characterCount.get(ch)+1);
            }
            else {
                //new character that is not added to map yet.
                characterCount.put(ch,1);
            }
        }
        for(Map.Entry entry:characterCount.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
