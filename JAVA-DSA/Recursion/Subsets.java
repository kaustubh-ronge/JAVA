public class Subsets {
    public static void main(String[] args) {
        String str = "abc";
        sub(str, "", 0);
    }

    public static void sub(String str, String p, int index) {
        if (index == str.length()) {
            System.out.println(p);
            return;
        }

        // include character
        sub(str, p + str.charAt(index), index + 1);

        // exclude character
        sub(str, p, index + 1);
    }
}