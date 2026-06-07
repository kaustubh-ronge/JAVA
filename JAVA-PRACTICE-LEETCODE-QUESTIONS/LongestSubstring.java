import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "abcdadcea";
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();
        int end = 0;
        int maxLength = 0;
        while (end < str.length()) {
            char ch = str.charAt(end);

            if (map.containsKey(ch) && map.get(ch) >= start) {
                start = map.get(ch) + 1;
            }
            map.put(ch, end);
            int currenLength = end - start + 1;
            if (currenLength > maxLength) {
                maxLength = currenLength;
            }
            end++;
        }
        System.out.println(maxLength);
    }
}
