package Kakomon10Sen;

import java.util.Scanner;

public class i18n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countChar = 0;
        String line = sc.nextLine();
        String[] lines = line.split("");

        for(String charactor : lines){
            countChar++;
        }

        countChar -= 2;

        System.out.println(lines[0] + countChar + lines[lines.length - 1]);
    }
}
