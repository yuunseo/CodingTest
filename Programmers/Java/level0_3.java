package Programmers.Java;

public class level0_3 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i=0; i<n; i++){
            answer[0][i] = i+1;
        }
        for(int i=0; i<n; i++){
            answer[i][n-1] = i+n;
        }
        for(int i=n-1; i>0; i--){
            answer[n-1][i] = n+i;
        }
        return answer;
        /*
        1. [0][0]~[0][n]까지 채운다. 행 =0
        2. [0][n]~[n][n]까지 채운다. 열 = n
        3. [n][n]~[n][0]까지 채운다. 행 =n
        4. [n][0]~[0+1][0]까지 채운다. 열=0
        5. ...


        */

    }
}
