package abc190;

import java.util.Scanner;

public class Magic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        final long S = sc.nextLong();
        final long D = sc.nextLong();
        boolean flag = false;

        for(int i = 0; i < N; i++){
            long X = sc.nextLong();
            long Y = sc.nextLong();

            if(X < S && Y > D){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
