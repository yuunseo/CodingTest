package Programmers.Java;

public class level0_9 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int count = 1;
        int row = 0;
        int row_end = n - 1;
        int col = 0;
        int col_end = n - 1;

        while (count <= n * n) {
            // 좌>우
            for (int i = col; i <= col_end; i++) {
                answer[row][i] = count++;
            }
            row++;

            // 상V하
            for (int i = row; i <= row_end; i++) {
                answer[i][col_end] = count++;
            }
            col_end--;

            // 좌<우
            for (int i = col_end; i >= col; i--) {
                answer[row_end][i] = count++;
            }
            row_end--;

            // 상^하
            for (int i = row_end; i >= row; i--) {
                answer[i][col] = count++;
            }
            col++;
        }

        return answer;
    }
}
