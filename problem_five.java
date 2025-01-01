public class problem_five {

    public static int maxProfit(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            max = Math.max(max, arr[i] - min);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 6, 7, 8 };

        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);

    }
}
