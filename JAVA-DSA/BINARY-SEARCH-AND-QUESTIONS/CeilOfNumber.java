public class CeilOfNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4, 4, 4, 6, 7 };
        int target = 8;

        int ans = ceilOfNumber(arr, target);
        System.out.println(ans);
    }

    public static int ceilOfNumber(int nums[], int target) {
        int ans = -1;
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = nums[mid];
                end = mid - 1;
            }
        }
        return ans;
    }

}
