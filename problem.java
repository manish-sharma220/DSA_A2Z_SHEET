import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class problem {

    public static String twoSum(int n, int arr[], int target) {

        // Using Hashing
        // HashMap<Integer, Integer> set = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        // int num = arr[i];
        // int required = target - num;
        // if (set.containsKey(required) == true) {
        // return "True";
        // }
        // set.put(num, i);
        // }
        // return "False";

        // Using Two pointer

        int left = 0;
        int right = arr.length - 1;
        Arrays.sort(arr);
        while (left <= right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "True";
            } else if (sum < target) {
                left++;
            } else
                right--;
        }

        return "False";
    }

    public static void main(String args[]) {
        int n = 5;
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        String ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);
    }
}
