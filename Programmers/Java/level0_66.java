import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        // int형 list 생성
        List<Integer> result = new ArrayList<>();        

        for(int i=1; i<=n; i++){
            if(n%i==0) result.add(i); // 나머지가 0인 약수일 경우, 추가
        }

        return result.stream()
                .mapToInt(i -> i)
                .toArray(); // int형 array로 반환
    }
}
