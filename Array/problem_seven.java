import java.util.*;

public class problem_seven {

    public static List<Integer> nextGreaterPermutation(List<Integer> A) {
        int index = -1;
        int n = A.size();
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            Collections.reverse(A);
        } else {
            for (int i = n - 1; i >= 0; i--) {
                if (A.get(i) > A.get(index)) {
                    int temp = A.get(index);
                    A.set(index, A.get(i));
                    A.set(i, temp);
                    break;
                }
            }
            List<Integer> sublist = A.subList(index + 1, n);
            Collections.reverse(sublist);
        }
        return A;
    }

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(new Integer[] { 2, 1, 5, 4, 3, 0, 0 });
        List<Integer> ans = nextGreaterPermutation(A);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");
    }
}
