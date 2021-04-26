package Kakomon10Sen;

import java.util.Scanner;

public class InfiniteCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, A;
        final int FIVE_HUNDRED_COIN = 500;
        N = sc.nextInt();
        A = sc.nextInt();

        while(N  >= FIVE_HUNDRED_COIN){
            N = N - FIVE_HUNDRED_COIN;
        }

        if(N <= A){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
