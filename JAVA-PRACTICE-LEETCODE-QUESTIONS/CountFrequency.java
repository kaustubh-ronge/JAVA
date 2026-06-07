import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 2, 2, 3, 4, 4, 4, 4, 5 };

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int count = 0;
        int maxFreq = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
            }
        }
        for (Integer val : map.values()) {
            if (val == maxFreq) {
                count++;
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Frequency of " + entry.getKey() + " is " + entry.getValue());
        }

        System.out.println(count);
        System.out.println(maxFreq);
    }
}
