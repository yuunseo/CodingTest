class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String result="";
        
        for(int i=0; i<finished.length; i++){
            
            // 아직 끝내지 못한 할 일은
            if(finished[i]==false){
                result += todo_list[i]; //result에 담고,
                result += " "; // 공백으로 구분해주기 위해 공백을 추가한다.
            }// 끝낸 할 일은 pass
            else continue; 
        }
        // 최종적으로 남은 할 일을 공백으로 구분하여 배열로 반환
        return result.split(" ");
    }
}
