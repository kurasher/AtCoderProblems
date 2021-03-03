package abc189;

import java.util.Scanner;

public class Slot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] lines = line.split("");

        if(lines[0].equals(lines[1]) && lines[0].equals(lines[2])){
            System.out.println("Won");
        }else{
            System.out.println("Lost");
        }
    }
}
