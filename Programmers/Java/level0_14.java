package Programmers.Java;

public class level0_14 {
    public int solution(int n, int k) {
        int answer = 0;
        //총 가격 = 12000*n
        //콜라의 총 개수 = k
        //콜라의 서비스 개수 = n/10 (int)
        answer = 12000*n + 2000*(k-n/10);
        return answer;
    }
}
