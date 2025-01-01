import java.util.*;
import java.util.Collections;

public class problem_eight {
    public static ArrayList<Integer> printLeadersBruteForce(int arr[], int n) {
        int max = arr[n - 1];
        ArrayList<Integer> sol = new ArrayList<>();
        sol.add(max);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                sol.add(arr[i]);
                max = arr[i];
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        int n = 6;
        int arr[] = { 10, 22, 12, 3, 0, 6 };

        ArrayList<Integer> ans = printLeadersBruteForce(arr, n);

        Collections.sort(ans, Collections.reverseOrder());

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

    }
}
