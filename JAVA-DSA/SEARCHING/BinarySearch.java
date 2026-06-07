import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: " + " ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Array Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.println();
        }

        System.out.println("Enter Key for Searching" + " ");

        int key = sc.nextInt();
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;

        BinarySearch bs = new BinarySearch();
        int ans = bs.binarySearch(arr, key, start, end);

        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + ans);
        }
    }

    public int binarySearch(int arr[], int key, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (key < arr[mid]) {
                end = mid - 1;

            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}