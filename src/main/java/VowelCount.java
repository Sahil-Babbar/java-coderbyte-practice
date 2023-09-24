public class VowelCount {
    private static Integer vowelCount(String str){
        Integer count =0;
        for(Character c: str.toCharArray() ){
            if(c == 'a' || c =='e' || c == 'i' || c == 'o' ||
                    c == 'A' || c =='E' || c == 'I' || c == 'O'
            ){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(vowelCount("All cows eat grass and moo"));
    }
}
