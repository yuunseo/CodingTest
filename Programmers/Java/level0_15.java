package Programmers.Java;

public class level0_15 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String item: s1){
            for(String item2: s2){
                if(item.equals(item2)) answer+=1;
            }
        }
        return answer;
    }
}
