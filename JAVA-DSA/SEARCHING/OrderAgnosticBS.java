public class OrderAgnosticBS {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        int key=2;

        OrderAgnosticBS obs=new OrderAgnosticBS();
        int ans=obs.binarySearch(arr, key);

        if(ans==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index "+ans);
        }

    }

    public int binarySearch(int []arr, int key){
        int start=0;
        int end=arr.length-1;

        boolean isAsc=arr[start]<arr[end];

        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                return mid;
            }


            if(isAsc){
                if(key>arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(key>arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
