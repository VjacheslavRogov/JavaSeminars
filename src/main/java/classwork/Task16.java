package classwork;

import java.util.HashMap;
import java.util.Map;

public class Task16 {
    public static void main(String[] args) {
        Map<Character,Integer> mapChar = new HashMap<>();
        String str = "askfgahskfh kjalksdfalksjhfkl lkaskdfalkjsn,asdf afsdf";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!mapChar.containsKey(str.charAt(i))){
                mapChar.put(currentChar,1);
            }else{
                mapChar.put(currentChar, mapChar.get(currentChar)+1);
            }
        }
        for (Map.Entry<Character, Integer> entity : mapChar.entrySet()) {
            System.out.println(entity.getKey() + " встретился в тексте : " + entity.getValue() + " раз(а)");
        }
    }
}
