package Programmers.Java;

public class level0_24 {
    public int solution(int[][] board) {
        int row = board.length;
        int col = board[0].length;

        int[][] danger = new int[board.length][board[0].length];
        int dan = 0; //위험 지역의 개수


        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(board[i][j]==1){
                    danger[i][j]=1;
                    if(i > 0) danger[i-1][j] =1; //상
                    if(i < row-1) danger[i+1][j] =1; //하
                    if(j < col-1) danger[i][j+1] =1; //우
                    if(j > 0) danger[i][j-1] =1; //좌
                    if(i > 0 && j>0) danger[i-1][j-1] =1; //상좌
                    if(i < row-1 && j>0) danger[i+1][j-1] =1; //하좌
                    if(i > 0 && j<col-1) danger[i-1][j+1] =1; //하우
                    if(i < row-1 && j<col-1) danger[i+1][j+1] =1; //상우


                }
            }

        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(danger[i][j]==1) dan+=1;
            }
        }

        return col*row-dan;
    }
}
