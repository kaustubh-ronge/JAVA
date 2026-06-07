import java.util.Scanner;

public class TwoDArrayLS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter no of cols: ");
        int cols=sc.nextInt();

        int arr[][]=new int[rows][cols];

        System.out.print("Enter array elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int key=sc.nextInt();
        TwoDArrayLS ts=new TwoDArrayLS();
         int []ans=ts.linearSearch(arr,key,rows,cols);
        if(ans[0]==-1&&ans[1]==-1){
        System.out.println("Element not found");
        }else{
            System.out.println(ans[0]+" "+ans[1]);
        }
    }

    public int[] linearSearch(int arr[][], int key, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == key) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}