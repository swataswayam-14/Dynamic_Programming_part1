import java.util.*;

public class fibRec{
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter n: ");
        n = sc.nextInt();
        System.out.println("The "+n+"th fibonacci term is " +fib(n));
    }
}