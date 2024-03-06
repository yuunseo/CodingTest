package Programmers.Java;

public class level0_1 {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i: array){
            if(i == n){
                answer+=1;
            }
        }
        return answer;
    }
}
