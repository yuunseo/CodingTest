import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        // 정답을 담을 리스트 생성
        List<String> result = new ArrayList<>();
        
        // for문을 이용하여, str에 하나씩 접근
        for(String str: strArr){
            // "ad"를 포함하면 pass
            if(str.contains("ad")) continue;
            // "ad"를 포함하지 않으면 result에 추가
            else result.add(str);
        }
        
        return result.toArray(new String[result.size()]);
    }
}
