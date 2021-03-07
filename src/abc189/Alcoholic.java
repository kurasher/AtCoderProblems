package abc189;

import java.util.Scanner;

public class Alcoholic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int V;
        int P;
        int sum = 0;
        int ans = -1;

        for(int i = 0 ; i < N; i++){
            V = sc.nextInt();
            P = sc.nextInt();

            sum = sum + V*P;


            if(X*100 < sum){
                ans = i+1;
                break;
            }
        }

        System.out.println(ans);

    }
}
