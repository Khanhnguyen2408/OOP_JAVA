import java.util.*;

public class BASIC002 {
    static final int MOD = 1000000007;

    public static long numPlaylists(int n, int goal, int k) {
        long[][] dp = new long[goal + 1][n + 1];
        
        dp[0][0] = 1;

        for (int i = 1; i <= goal; i++) {
            for (int j = 1; j <= n; j++) {

                // Thêm bài mới
                dp[i][j] += dp[i - 1][j - 1] * (n - (j - 1));
                dp[i][j] %= MOD;

                // Thêm bài cũ
                if (j > k) {
                    dp[i][j] += dp[i - 1][j] * (j - k);
                    dp[i][j] %= MOD;
                }
            }
        }

        return dp[goal][n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            int goal = sc.nextInt();

            System.out.println(numPlaylists(n, goal, k));
        }

        sc.close();
    }
}