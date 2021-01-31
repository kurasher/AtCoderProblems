package abc186;

import java.util.Scanner;

public class BlocksAndGrids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, W;
        N = sc.nextInt();
        W = sc.nextInt();
        int[][] A = new int[N][W];

        int min = 1000;

        for (int i = 0; i < N; i++){
            for (int j = 0; j < W; j++){
                A[i][j] = sc.nextInt();
                if (A[i][j] < min){
                    min = A[i][j];
                }
            }
        }

        int removeBricks = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < W; j++){
                removeBricks += (A[i][j] - min);
            }
        }

        System.out.println(removeBricks);
    }
}
