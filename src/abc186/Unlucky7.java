package abc186;

import java.util.Scanner;

public class Unlucky7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;
        for(int i = 1; i <= N; i++){
            boolean flag10 = false;
            boolean flag8 = false;

            String N10 = String.valueOf(i);
            String[] N10s = N10.split("");
            for(String s : N10s){
                if(s.equals("7")){
                    flag10 = true;
                }
            }

            String N8 = Integer.toOctalString(i);
            String[] N8s = N8.split("");
            for(String s : N8s){
                if(s.equals("7")){
                    flag8 = true;
                }
            }

            if(!flag10 && !flag8){
                count++;
            }

        }

        System.out.println(count);
    }
}
