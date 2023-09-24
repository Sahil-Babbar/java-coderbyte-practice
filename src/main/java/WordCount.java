public class WordCount {
    private static Integer wordCount(String str){
        String[] words =str.split(" ");
        return str.length()>0 ? words.length :0;
    }

    public static void main(String[] args) {
        System.out.println(wordCount("The mind was dreaming. The world was its dream."));
        System.out.println(wordCount("The Devil never listen to me"));
        System.out.println(wordCount(""));
    }
}
