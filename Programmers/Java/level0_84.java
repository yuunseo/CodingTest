import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        while(true){
            list.add(n);
            if(n%2==0){
                n = (int)n/2;
            }else{
                n = 3*n+1;
            }
            if(n==1){
                list.add(n);
                break;
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i).intValue();
        }
        return answer;
    }
}
