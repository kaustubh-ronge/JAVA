public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6, 7 };
        int n = arr.length;
        int i = 0;
        int t = 4;
       int ans= linearSearch(arr, i, n - 1, t);
       System.out.println(ans);
    }

    static int linearSearch(int[] arr, int i, int n, int t) {
        if (i == n) {
            return -1;
        }

        if (arr[i] == t) {
            return i;
        }
       return linearSearch(arr, i+1, n, t);

        

    }
}