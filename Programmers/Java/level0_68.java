import java.util.*;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase(); // 모두 소문자화
        char[] chrArray = my_string.toCharArray(); // char 배열 생성
        Arrays.sort(chrArray); // char 문자 정렬

        return new String(chrArray); // string으로 반환
    }
}
