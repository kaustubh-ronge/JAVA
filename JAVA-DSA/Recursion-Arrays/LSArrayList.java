import java.util.ArrayList;

public class LSArrayList {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 4, 5, 6, 4 };
        int i = 0, n = arr.length - 1;
        int target = 0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = linearSearch(arr, i, n, target, list);
        System.out.println(ans);

    }

    static ArrayList<Integer> linearSearch(int arr[], int i, int n, int target, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }

        if (arr[i] == target) {
            list.add(i);
        }

        linearSearch(arr, i + 1, n, target, list);

        return list;
    }
}
