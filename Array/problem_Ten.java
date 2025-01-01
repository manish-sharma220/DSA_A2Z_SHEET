
import java.util.*;

public class problem_Ten {
    // better solution
    // public static int longestSuccessiveElements(int arr[]) {
    // int count = 1;
    // int max = Integer.MIN_VALUE;
    // int current_smaller = Integer.MIN_VALUE;
    // Arrays.sort(arr);
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] - 1 == current_smaller) {
    // count++;
    // current_smaller = arr[i];
    // } else if (current_smaller != arr[i]) {
    // count = 1;
    // current_smaller = arr[i];
    // }
    // max = Math.max(max, count);
    // }
    // return max;
    // }

    // optimal solution

    public static int longestSuccessiveElements(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int max = 1;
        for (int it : set) {

            if (set.contains(it - 1) != true) {
                int count = 0;
                int x = it;
                while (set.contains(x + 1)) {
                    count++;

                }
                max = Math.max(max, count);
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = { 100, 200, 1, 2, 3, 4 };
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
