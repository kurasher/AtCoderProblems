package Kakomon10Sen;

import java.util.*;

import java.util.Arrays;
import java.util.Scanner;

public class TwoAnagrams{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next(), t = scan.next();
        char[] ss = s.toCharArray(), tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        s = new String(ss);
        t = new String(tt);
        StringBuilder ttt = new StringBuilder(t);
        ttt.reverse();
        t = new String(ttt);
        if (s.compareTo(t) < 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}