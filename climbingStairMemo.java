import java.util.*;
public class climbingStairMemo {
    public static int countStairs(int n, int dp[]){
        dp[0] = 1;
        dp[1] = 1;

        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = countStairs(n-1, dp) + countStairs(n-2, dp);
        return dp[n];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter n: ");
        n = sc.nextInt();
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println("The number of possible ways of reaching "+n+"th stair is " +countStairs(n, dp));
    }
}
