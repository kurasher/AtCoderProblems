package Kakomon10Sen;

import java.util.Scanner;

public class SomthingOnIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = 700;

        String line = sc.nextLine();
        String[] lines = line.split("");

        for(String it : lines){
            if(it.equals("o")){
                price += 100;
            }
        }

        System.out.println(price);
    }
}

