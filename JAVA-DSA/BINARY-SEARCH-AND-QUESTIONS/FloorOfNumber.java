public class FloorOfNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4, 4, 4, 6, 7 };
        int target = 8;

        int ans = floorOfNumber(arr, target);
        System.out.println(ans);
    }

    public static int floorOfNumber(int arr[], int target) {
        int ans = -1;
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = arr[mid];
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
                ans = arr[mid];
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
