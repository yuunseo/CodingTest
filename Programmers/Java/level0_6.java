package Programmers.Java;

public class level0_6 {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] > height) answer ++;
        }
        return answer;
    }
}
