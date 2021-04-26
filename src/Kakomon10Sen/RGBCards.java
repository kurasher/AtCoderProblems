package Kakomon10Sen;

import java.util.Scanner;

public class RGBCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, g, b;
        r = sc.nextInt();
        g = sc.nextInt();
        b = sc.nextInt();

        if((g*10 + b) % 4 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
