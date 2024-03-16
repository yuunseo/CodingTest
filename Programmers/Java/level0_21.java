package Programmers.Java;

import java.util.*;

public class level0_21 {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers); //오름차순 정렬
        answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        return answer;
    }

}
