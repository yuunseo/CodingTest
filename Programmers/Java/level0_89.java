import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        Queue<String> queue = new LinkedList<>();
        
        for(int i=0; i<my_string.length(); i++){
            String str = Character.toString(my_string.charAt(i));
            if(!queue.contains(str)){
                queue.add(str);
            }
        }
        int size = queue.size();
        for(int i=0; i<size; i++){
            answer+=queue.poll();
        }
        return answer;
    }
}
