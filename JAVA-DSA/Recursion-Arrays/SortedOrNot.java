public class SortedOrNot {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7,4 };
        int n = arr.length;
        int i = 0;
        boolean ans = isSorted(arr, i, n - 1);

        System.out.println(ans);
    }

    public static boolean isSorted(int arr[], int start, int end) {
        if (start >= end ) {
            return true;
        }

        if (arr[start] <= arr[start + 1]) {
          return  isSorted(arr, start + 1, end);
        } else {
            return false;
        }
    

    }
}