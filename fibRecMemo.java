import java.util.*;
public class fibRecMemo {
    public static int fibMemo(int n, int dp[]){
        dp[0] = 0;
        dp[1] = 1;

        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = fibMemo(n-1, dp) + fibMemo(n-2, dp);
        return dp[n];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println("the "+n+"th fibonacci term is "+fibMemo(n,dp));
    }
}
