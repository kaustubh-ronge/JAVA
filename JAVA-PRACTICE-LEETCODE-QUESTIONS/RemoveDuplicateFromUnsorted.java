import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicateFromUnsorted {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 6, 5, 4, 9, 8, 8, 8, 9, 9, 9, 3, 3 };
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                continue;
            }
            map.put(arr[i], i);
            list.add(arr[i]);
        }

        System.out.println(list);
    }
}
