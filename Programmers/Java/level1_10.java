import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> result = new Stack<>();
        
        for(int i: moves){
            int num = i-1;
            for(int j=0; j<board.length; j++){
                
                // 인형이 있는 칸만 처리하기
                if(board[j][num]!=0){
                    // 비어있거나, 비어있지 않은데 이전 인형과 다른 경우에는 push
                    if(result.empty() || (!result.empty() && result.peek() != board[j][num])){
                        result.push(board[j][num]);
                        board[j][num]=0; 
                        break;
                    }
                    // 비어있지 않은데 이전 인형과 같은 경우에는 pop
                    else if(!result.empty() && result.peek() == board[j][num]){
                        answer+=2;
                        result.pop();
                        board[j][num]=0; 
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}
