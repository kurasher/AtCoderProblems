package abc190;

import java.util.Scanner;

public class VeryVeryPrimitiveGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(C == 0){
            if(A <= B){
                System.out.println("Aoki");
            }else{
                System.out.println("Takahashi");
            }
        }else{
            if(B <= A){
                System.out.println("Takahashi");
            }else{
                System.out.println("Aoki");
            }
        }
    }
}
