import java.util.Scanner;

import javax.sound.sampled.Line;

public class LinearSearchInRange {
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
        System.out.println("Enter first index of range");
        int first = sc.nextInt();
        System.out.println("Enter second index of range");
        int second = sc.nextInt();

        LinearSearchInRange ls = new LinearSearchInRange();

        int ans = ls.linearSearch(first, second, arr, key);

        if (ans == -1) {
            System.out.println("no any element");
        } else {
            System.out.println("Index found at" + ans);
        }

    }

    public int linearSearch(int first, int second, int arr[], int key) {
        try {
            for (int i = first; i <= second; i++) {
                if (arr[i] == key) {
                    return i;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Please enter size less than array sizw");
        }
        return -1;
    }
}
