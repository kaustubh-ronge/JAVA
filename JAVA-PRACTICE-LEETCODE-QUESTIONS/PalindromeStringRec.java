public class PalindromeStringRec {

    public static void main(String[] args) {
        String s = "abbaksbjkjbkjbkjebf";
        int start = 0;
        int end = s.length() - 1;
        boolean ans = isPalindrome(s, 0, s.length() - 1);
        System.out.println(ans);
    }

    public static boolean isPalindrome(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end))
            return false;

        return isPalindrome(s, start + 1, end - 1);

    }

}
