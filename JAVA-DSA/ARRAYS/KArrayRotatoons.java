public class KArrayRotatoons{
    public static void main(String args[]){
        int arr[]={1,2,3,5,6,7,8};
        int k=4;
        int len=arr.length;
        k%=len;
        rotate(arr,0,len-1);
        rotate(arr,0,k-1);
        rotate(arr,k,len-1);
        printArray(arr);
    }
    public static void rotate(int arr[],int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}