public class MeamRec {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int i = 0;
        int n = arr.length;
        int ans = minRec(arr, n, i);
        System.out.println(ans);
    }

    public static int minRec(int arr[], int n, int i) {
        if (i == arr.length) {
            return 0;
        }
        int sum = arr[i] + minRec(arr, n, i + 1);
        if (i == 0) {
            return sum / n;
        }
        return sum;
    }

}
