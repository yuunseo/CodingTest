import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        // 인형뽑기 칸 스택
        int answer = 0;
        Stack<Integer> result = new Stack<>();
        
        for(int num: moves){
            // num-1 번째 열에서 인형 가져오기
            int col_num = num-1;
            int row_num=0;
            
            while(row_num<5){
                
                // 인형이 없는 칸이라면, 다음 칸으로 이동
                if(board[row_num][col_num]==0) 
                    row_num+=1;
                // 인형이 있는 칸이라면, 인형을 잡아서 이동
                else if(board[row_num][col_num]!=0){
                    // result가 빈 스택이라면, 그대로 push
                    if(result.empty()){
                        result.push(board[row_num][col_num]);
                    }// result의 맨 위에 존재하는 인형이라면, 함께 pop
                    else if(result.peek() == board[row_num][col_num]){
                        answer+=1;
                        result.pop();
                    }// result의 맨 위에 존재하는 인형이 아니라면, 그대로 push
                    else{
                        result.push(board[row_num][col_num]);    
                    }
                    

                }
            }
            

        }
        return answer;
    }
}
