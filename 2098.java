import java.io.*;
import java.util.*;

public class Main {

    static int n, finish;
    static final int INF = 1000000000;
    static int[][] cost;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        cost = new int[n][n];
        dp = new int[n][1 << (n - 1) + 1];
        for (int i=0; i<n; i++)
            finish |= 1 << i;
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++)
                cost[i][j] = Integer.parseInt(st.nextToken());
        }
        System.out.println(dfs(0, 1));
    }

    static int dfs(int node, int b) {
        if (b == finish) {
            if (cost[node][0] == 0)
                return INF;
            return cost[node][0];
        }
        if (dp[node][b] != 0)
            return dp[node][b];
        dp[node][b] = INF;
        for (int i=0; i<n; i++) {
            int flag = 1 << i;
            if (cost[node][i] != 0 && (b & flag) == 0)
                dp[node][b] = Math.min(dp[node][b], dfs(i, b | flag) + cost[node][i]);
        }
        return dp[node][b];
    }
}
