import java.util.*;
public class climbingStairTab {
    public static int countStairs(int n){
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            if(dp[i] != -1){
                return dp[i];
            }
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter n: ");
        n = sc.nextInt();
        
        System.out.println("The number of possible ways of reaching "+n+"th stair is " +countStairs(n));
    }
}
