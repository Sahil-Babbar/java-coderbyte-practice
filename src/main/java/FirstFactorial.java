public class FirstFactorial {
    private static Integer firstFactorial(Integer num){
        if(num ==0){
            return 1;
        }
        return num * firstFactorial(num - 1);
    }

    public static void main(String[] args) {
        System.out.println(firstFactorial(4));
    }
}
