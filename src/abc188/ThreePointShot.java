package abc188;

import java.util.Scanner;

public class ThreePointShot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X, Y;
        X = sc.nextInt();
        Y = sc.nextInt();

        final int point = 3;

        if(Math.abs(X-Y) < point){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
