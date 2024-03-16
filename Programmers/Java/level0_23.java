package Programmers.Java;

public class level0_23 {
    public int solution(int[][] dots) {

        double line1 = ((double)(dots[1][1]-dots[0][1])/(dots[1][0]-dots[0][0]));
        double line2 = ((double)(dots[3][1]-dots[2][1])/(dots[3][0]-dots[2][0]));
        if(line1==line2) return 1;

        double line3 = ((double)(dots[2][1]-dots[0][1])/(dots[2][0]-dots[0][0]));
        double line4 = ((double)(dots[3][1]-dots[1][1])/(dots[3][0]-dots[1][0]));
        if(line3==line4) return 1;

        double line5 = ((double)(dots[3][1]-dots[0][1])/(dots[3][0]-dots[0][0]));
        double line6 = ((double)(dots[2][1]-dots[1][1])/(dots[2][0]-dots[1][0]));
        if(line5==line6) return 1;


        else return 0;

    }
}
