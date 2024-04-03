import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 각 배열들끼리 원소 비교를 위해, 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i<completion.length; i++){
            // 1. 정렬한 값들이 서로 다른 값과 매칭될 때, return
            if(participant[i].equals(completion[i])) continue;
            else return participant[i];
        }
        // 2. participant가 하나 남을 때, return
        return participant[participant.length-1];


    }
}
