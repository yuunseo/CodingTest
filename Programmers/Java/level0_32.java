package Programmers.Java;
import java.util.*;
public class level0_32 {
    public int[] solution(int n, int[] numlist) {
        List <Integer> answerList = new ArrayList <Integer>();
        for(int num: numlist){
            if(num%n==0) answerList.add(num);
        }
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
