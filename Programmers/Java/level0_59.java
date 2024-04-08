import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        // result를 담을 int형 list 생성
        List<Integer> intList = new ArrayList<>();        
        
        for(int i=0; i<my_string.length(); i++){
            // 만약 letter인 경우, pass
            if(Character.isLetter(my_string.charAt(i))) continue;
            // 만약 digit인 경우, intList에 int type으로 추가
            else intList.add(my_string.charAt(i)-'0'); // -> char를 int로 변형하기 위해서는 아스키코드 '0'값을 빼준다.
        }
        
        // Integer List를 Array로 변환하기 위해 stream, map사용
        int[] result = intList.stream()
                .mapToInt(i -> i)
                .toArray();
        
        // Array를 정렬하기 위해 Arrays.sort()사용 > sort()는 return type이 void이므로, 대입해주지 않는다.
        Arrays.sort(result);
        // 정렬된 result Array를 return
        return result;
    }
}
