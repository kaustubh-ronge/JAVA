

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int nums[] = { -4, -1, 0, 3, 10 };
        int[] finalAns = sortedSquares(nums);
        for (int i = 0; i < nums.length; i++) {

            System.out.println(finalAns[i]);
        }
    }

    public static int[] sortedSquares(int[] nums) {

        int ans[] = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;
        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {

                ans[k] = nums[i] * nums[i];
                i++;
                j--;
            } else {
                ans[j] = nums[j] * nums[j];
                j--;
                k--;
            }

        }

        return ans;
    }
}
