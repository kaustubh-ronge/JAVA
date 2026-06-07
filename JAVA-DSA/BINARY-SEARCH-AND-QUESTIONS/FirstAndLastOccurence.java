public class FirstAndLastOccurence {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 3, 4, 4, 4, 5, 6, 7 };

        // FIRST AND LAST OCCURENCE

        int ans[] = searchRange(arr);

        for (int a : ans) {
            System.out.print(a + " ");
        }

        // COUNT OF ELEMENT

        // int first = binarySearch(arr, 4, true);
        // int second = binarySearch(arr, 4, false);

        // if (first == -1) {
        // System.out.print("First occurence is : " + 0);
        // } else {
        // System.out.print("count of target is : " + (second - first + 1));
        // }

    }

    public static int[] searchRange(int arr[]) {
        int first = binarySearch(arr, 4, true);
        int second = binarySearch(arr, 4, false);
        return new int[] { first, second };
    }

    public static int binarySearch(int arr[], int target, boolean isFirst) {
        int start = 0, end = arr.length - 1, ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return ans;
    }
}