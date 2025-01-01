import java.util.*;

public class problem_six {

    public static void permute(int index, int nums[], List<List<Integer>> ans) {
        if (index == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(ds);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            permute(index + 1, nums, ans);
            swap(i, index, nums);
        }
    }

    public static void swap(int first, int second, int nums[]) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 3 };
        List<List<Integer>> ans = new ArrayList<>();
        permute(0, nums, ans);
        for (List<Integer> result : ans) {
            System.out.println(result);
        }
    }
}
