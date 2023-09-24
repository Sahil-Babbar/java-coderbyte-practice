public class TwoSum {
    private static String twoSum(int[] arr){
        Integer targetNumber=arr[0];
        StringBuilder result =new StringBuilder();
        for(Integer i = 1; i <arr.length; i++){
            for(Integer j = i+1; j<arr.length; j++){
                if( arr[i] + arr[j] == targetNumber){
                    result.append(arr[i]).append(",").append(arr[j]);
                    result.append(" ");
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{8, 1, 2, 3, 4, 8 ,9}));
    }
}
