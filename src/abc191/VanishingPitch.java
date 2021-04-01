package abc191;

import java.util.Scanner;

public class VanishingPitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = 0;
        int t = 0;
        int s = 0;
        int d = 0;

        v = sc.nextInt();
        t = sc.nextInt();
        s = sc.nextInt();
        d = sc.nextInt();

        if(v * t <= d && d <= v*s){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
