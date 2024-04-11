class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        // 상 h-1
        // 하 h+1
        // 좌 w-1
        // 우 w+1
        // 근데 이제 모서리일 때를 고려해야됨. h=0 또는 h=n-1, w=0 또는 w=n-1
        
        String color = board[h][w];
        int n = board.length;
        
        if(h==0){
            if(color.equals(board[h+1][w])) answer++;
        }else if(h==n-1){
            if(color.equals(board[h-1][w])) answer++;
        }else{
            if(color.equals(board[h+1][w])) answer++;
            if(color.equals(board[h-1][w])) answer++;
        }
        if(w==0){
            if(color.equals(board[h][w+1])) answer++;
        }else if(w==n-1){
            if(color.equals(board[h][w-1])) answer++;
        }else{
            if(color.equals(board[h][w+1])) answer++;
            if(color.equals(board[h][w-1])) answer++;
        }
        return answer;
    }
}
