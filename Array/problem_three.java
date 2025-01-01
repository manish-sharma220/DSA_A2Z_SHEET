import java.util.*;

public class problem_three {

    public static int majorityElement(int arr[]) {

        // USING HashMap
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // }
        // for (Map.Entry<Integer, Integer> it : map.entrySet()) {
        // if (it.getValue() > arr.length / 2) {
        // return it.getKey();
        // }
        // }
        // return -1;

        // Moore’s Voting Algorithm:
        int element = -1;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cnt == 0)
                element = arr[i];
            if (arr[i] == element)
                cnt++;
            else
                cnt--;
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element)
                count++;
        }
        if (count > arr.length / 2)
            return element;

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 4, 4, 4, 4, 2, 2 };
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);

    }
}
