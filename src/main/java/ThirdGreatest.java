import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ThirdGreatest {
    private static String thirdGreatest(String[] arr){
        Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        return arr[arr.length -3];
    }

    public static void main(String[] args) {
        System.out.println(thirdGreatest(new String[]{"flowers", "decorate", "soul", "sleep"}));
    }
}
