import java.util.Scanner;

public class LinearSearch {
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

        System.out.println("Enter Key for Searching"+" ");

        int key=sc.nextInt();

        LinearSearch ls =new LinearSearch();

        int ans=ls.linearSearch(key,arr);

        if(ans==-1){
            System.out.println("Element not found at any index");
        }else{
            System.out.println("Element found"+" "+ans);
        }
    }

    public int linearSearch(int key, int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}