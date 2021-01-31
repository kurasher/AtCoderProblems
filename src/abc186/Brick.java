package abc186;

import java.util.Scanner;

public class Brick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, W;
        N = sc.nextInt();
        W = sc.nextInt();

        int answer = 0;
        answer = N / W;
        System.out.println(answer);
    }
}
