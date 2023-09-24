public class TimeConvert {
    private static String timeConversion(Integer num){
        StringBuilder result = new StringBuilder();
        Integer hour =num/60;
        Integer min =num %60;
        result.append(hour).append(":").append(min);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(timeConversion(178));
    }
}
