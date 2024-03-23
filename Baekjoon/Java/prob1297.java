package Baekjoon.Java;

import java.util.Scanner;

public class prob1297 {
    //w^2 + h^2 = c^2
    //w:h = 9:16
    //w = 16/9*h
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int d = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        double h = Math.sqrt((Math.pow(a,2) * Math.pow(d,2)) / (Math.pow(a,2)+Math.pow(b,2)));
        double w = h* b/a;

        System.out.println((int)h+" "+(int)w);

    }
}
