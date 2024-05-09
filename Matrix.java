import java.util.*;
import java.io.*;


public class Matrix {

    static final int N = 105;
    static final int R = 3;
    static final int C = 4;

    static int maximumValue(int n, int m, int p,
                            int grid[][]) {
        boolean dp[][][] = new boolean[N][N][N];
        int i, j, k;


        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                for (k = 0; k < N; k++)
                    dp[i][j][k] = false;
            }
        }


        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                for (k = grid[i][j]; k <= p; k++) {


                    if (i == 0 && j == 0) {
                        if (k == grid[i][j])
                            dp[i][j][k] = true;
                    } else if (i == 0) {
                        dp[i][j][k] = (dp[i][j][k] ||
                                dp[i][j - 1][k - grid[i][j]]);
                    } else if (j == 0) {
                        dp[i][j][k] = (dp[i][j][k] ||
                                dp[i - 1][j][k - grid[i][j]]);
                    } else {


                        dp[i][j][k] = (dp[i][j][k] ||
                                dp[i][j - 1][k - grid[i][j]]);


                        dp[i][j][k] = (dp[i][j][k] ||
                                dp[i - 1][j][k - grid[i][j]]);


                        dp[i][j][k] = (dp[i][j][k] ||
                                dp[i - 1][j - 1][k - grid[i][j]]);
                    }
                }
            }
        }
        k = p;


        int ans = 0;
        for (ans = k; ans >= 0; ans--)
            if (dp[n - 1][m - 1][ans])
                break;

        return ans;
    }


    public static void main(String[] args) {
        int n = 3, m = 4, p = 9;
        int grid[][] = {{2, 3, 4, 1},
                {6, 5, 5, 3},
                {5, 2, 3, 4}};

        System.out.println(maximumValue(n, m, p, grid));


    }
}
