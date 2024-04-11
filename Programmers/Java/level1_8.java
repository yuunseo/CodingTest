class Solution {
    public int solution(String[][] board, int h, int w) {
                
        // 상 h-1
        // 하 h+1
        // 좌 w-1
        // 우 w+1
        
        String color = board[h][w];
        int n = board.length;
        int count = 0;
        
        if(h > 0 && color.equals(board[h-1][w])) count++; // 위쪽
        if(h < n-1 && color.equals(board[h+1][w])) count++; // 아래쪽
        if(w > 0 && color.equals(board[h][w-1])) count++; // 왼쪽
        if(w < n-1 && color.equals(board[h][w+1])) count++; // 오른쪽
        
        return count;
    }
}
