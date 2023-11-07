import java.util.*;
public class fibRecTab {
    public static int fibTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter n: ");
        n = sc.nextInt();
        System.out.println("The "+n+"th fibonacci term is " +fibTab(n));
    }
}
