import java.util.Arrays;

public class FibUsingDP {
    public static void main(String[] args) {
        int n = 4;
        int ans = fib(n);
        System.out.println(ans);
    }

    public static int fib(int n) {
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        return recursiondp(n, dp);
    }

    public static int recursiondp(int n, int dp[]) {
        if (n <= 1) {
            dp[n] = n;
            return dp[n];
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = fib(n - 1) + fib(n - 2);

        return dp[n];
    }
}
