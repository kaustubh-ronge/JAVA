import java.util.Scanner;

public class FibUsingTabulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter n : ");
        int n = sc.nextInt();
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        int ans = recur(n, dp);
        System.out.println(ans);

    }

    public static int recur(int n, int[] dp) {
        for (int state = 2; state <= n; state++) {
            dp[state] = dp[state - 1] + dp[state - 2];
        }
        return dp[n];
    }
}