import java.util.HashMap;

public class NonRepeatingCharacter {
    public String SearchingChallenge(String str){
        str= str.toLowerCase();
        HashMap<Character,Integer> charFrequency= new HashMap<>();
        for(char c: str.toCharArray()){
            charFrequency.put(c,charFrequency.getOrDefault(c,0)+1);
        }
        for(char c: str.toCharArray()){
            if(charFrequency.get(c)==1){
                String token="abcd";
                for(char ch :token.toCharArray()){
                    str = str.replaceAll(String.valueOf(c), "");
                }
                if(str.isEmpty()){
                    return "Empty";
                }
                return String.valueOf(c);
            }
        }
        return "Empty";
    }

    public static void main(String[] args) {
        NonRepeatingCharacter obj =new NonRepeatingCharacter();
        String input = "agettkgbeee";
        String result = obj.SearchingChallenge(input);
        System.out.println(result);
    }
}
