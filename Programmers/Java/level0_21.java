package Programmers.Java;

import java.util.*;
import java.util.stream.*;

public class level0_21 {
    public int solution(int[] numbers) {
        int answer = 0;
        int max=0;
        // 1번째로 큰 값 찾기
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max) max=numbers[i];
        }
        answer += max;
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        numbers[list.indexOf(max)]=0;
        // 2번째로 큰 값 찾기
        max=0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max) max=numbers[i];
        }
        answer *= max;

        return answer;
    }

}
