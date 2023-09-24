import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DistinctCharacters {
    private static String checkDistinctCharacters(String str){

        Set<Character> characterSet =new HashSet<>();
        for(Character c: str.toCharArray()){
            characterSet.add(c);
        }

        if(characterSet.size()>=10){
            return "true";
        }
        return "false";
    }

    public static void main(String[] args) {
        System.out.println(checkDistinctCharacters("abc123kkmmmm?"));
    }
}
