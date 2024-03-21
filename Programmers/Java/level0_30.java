package Programmers.Java;

public class level0_30 {
    public int solution(int n) {
        int answer = 0;
        int sqrt = (int)Math.sqrt(n);
        answer = (n == sqrt*sqrt) ? 1 : 2;
        return answer;
    }
}
