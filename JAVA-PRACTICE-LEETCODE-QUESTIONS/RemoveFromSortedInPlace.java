// import java.util.HashSet;

// public class RemoveFromSortedInPlace {

//     public static void main(String[] args) {
//         int arr[] = { 1, 1, 2, 2, 2, 3, 4, 4, 4, 4, 5 };
//         HashSet<Integer> set = new HashSet<>();
//         int index = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (set.contains(arr[i])) {

//                 continue;
//             }else{
//                 set.add(arr[i]);
//                 arr[index]=arr[i];
//                 index++;
//             }
//         }
//         for(int i=0;i<index;i++){
//             System.out.println(arr[i]);
//         }
//     }

// }

public class RemoveFromSortedInPlace {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 4, 4, 4, 4, 5 };

        int i = 1;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
            i++;

        }
        for (int k = 0; k <= j; k++) {
            System.out.println(arr[k]);
        }
    }
}