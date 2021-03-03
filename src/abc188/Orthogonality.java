package abc188;

import java.util.Scanner;

public class Orthogonality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        long sum = 0;

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            B[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++ ){
            sum += A[i] * B[i];
        }

        if(sum == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
