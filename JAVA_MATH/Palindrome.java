import java.util.Scanner;

public class Palindrome {
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number" + " ");
        int x = sc.nextInt();
        int original=x;

        try {
            int rev=0;

            if (x < 0) {
                System.out.print("Number is negative hence not palindrome");
            }
            while (x != 0) {
                int digit = x % 10;
                rev = rev * 10 + digit;
                x = x / 10;
            }

            if (original == rev) {
                System.out.println("Palindrome");
            }else{
                System.out.println("Not palindrome");
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
