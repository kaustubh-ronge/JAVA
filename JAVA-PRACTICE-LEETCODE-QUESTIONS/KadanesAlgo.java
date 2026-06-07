public class KadanesAlgo {
    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // output is 6

        int maxSum = arr[0];
        int currSum = 0;

        for (int i = 1; i < arr.length; i++) {
            if (currSum < 0) {
                currSum = 0;

            }

            currSum += arr[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }

        }
        System.out.println(maxSum);
    }
}
