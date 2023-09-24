import java.util.HashMap;

public class ReplaceEveryFourthCharacter {
    public String SearchingChallenge(String str){
        String output ="";
        str= str.toLowerCase();

        HashMap<Character,Integer> characterIntegerHashMap =new HashMap<>();
        for(char c: str.toCharArray()){
            characterIntegerHashMap.put(c, characterIntegerHashMap.getOrDefault(c,0)+1);
        }
        for(char c:str.toCharArray()){
            if(characterIntegerHashMap.get(c) == 1){
                output=String.valueOf(c);
                break;
            }
        }
        System.out.println(output);
        return  output;
    }
    public String replaceEveryFourthCharacter(String output){
        String token ="ty38podjqfe7";
        String concatenatedString=output+token;
        StringBuilder modifiedString = new StringBuilder(concatenatedString);

        for (int index = 3; index < modifiedString.length(); index += 4) {
            modifiedString.setCharAt(index, '_');
        }
        return modifiedString.toString();
    }

    public static void main(String[] args) {
        ReplaceEveryFourthCharacter obj =new ReplaceEveryFourthCharacter();
       String firstNonRepeatingChar= obj.SearchingChallenge("hello world hi hey");
        System.out.println(obj.replaceEveryFourthCharacter(firstNonRepeatingChar));
    }
}
