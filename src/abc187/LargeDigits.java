package abc187;

import java.util.Scanner;

public class LargeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A, B;
        A = sc.next();
        B = sc.next();

        int sumA = 0;
        int sumB = 0;

        sumA = calc(A);
        sumB = calc(B);

        if(sumA < sumB){
            System.out.println(sumB);
        }else{
            System.out.println(sumA);
        }

    }

    public static int calc(String line){
        int num = 0;
        String[] lines = line.split("");
        for(int i = 0; i < lines.length; i++){
            num = num + Integer.parseInt(lines[i]);
        }
        return num;
    }

}
