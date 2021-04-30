package Kakomon10Sen;

import java.util.Scanner;

public class Already2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lines = line.split("/");

        lines[0] = "2018";

        System.out.println(lines[0] + "/" + lines[1] + "/" + lines[2]);
    }
}
