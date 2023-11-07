import java.util.*;
public class climbingStairsRec {
    public static int countStairs( int n){
        if(n==0 || n==1){
            return 1;
        }
        return countStairs(n-1) + countStairs(n-2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter n: ");
        n = sc.nextInt();
        System.out.println("The number of possible ways of reaching "+n+"th stair is " +countStairs(n));
    }
}
//this code has an exponential time complexity
//O(2^n)
