import java.util.Scanner;

public class InsertionSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int length = sc.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter elements in array :");

        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        InsertionSort is = new InsertionSort();

        is.insertionSort(arr, length);
    }

    public void insertionSort(int arr[], int length) {
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] < arr[j]) {
                    break;
                }
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

            }
        }
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }

}