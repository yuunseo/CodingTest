package Programmers.Java;

public class level0_5 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i=0; i<strlist.length;i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
