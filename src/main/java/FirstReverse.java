public class FirstReverse {
    private static String firstReverse(String str){
        StringBuilder result =new StringBuilder();
        for(Integer index =str.length() -1;index>=0; index --){
            result.append(str.charAt(index));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(firstReverse("destiny tests us with every new day"));
    }
}