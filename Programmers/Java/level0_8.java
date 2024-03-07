package Programmers.Java;

public class level0_8 {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);
        for(int i=0; i<num.length(); i++){
            answer += num.charAt(i) - '0';
        }

        return answer;
    }
}
