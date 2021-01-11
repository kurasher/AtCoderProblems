package abc185;

import java.util.Scanner;

public class ABCPreparation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line;
        int[] questions = new int[4];

        for(int i = 0; i < 4; i++){
            questions[i] = Integer.parseInt(sc.next());
        }

        int ans = 1000;
        for(int question : questions){
            ans = Math.min(ans, question);
        }

        System.out.println(ans);
    }
}
