import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        /*
        1. X에서 한 글자씩 가져온다. > 정렬 > 내림차순 정렬
        2. 가져온 글자를 Y에 포함되는지 확인한다. > Map을 이용하여 접근, contains()의 시간 복잡도는 너무 큼.
        3. 포함된다면 해당 글자를 Y에서 지우고 반복한다.
        4. 포함되지 않는다면 다시 X에서 가져오기를 반복한다.
        5. 공통인 글자는 temp 변수에 저장한다.
        6. temp에 저장된 숫자가 없다면 -1반환
        7. temp에 저장된 숫자가 있다면 숫자 반환
        */

        StringBuilder temp = new StringBuilder();

        // X 문자열을 내림차순으로 정렬
        char[] X_chars = X.toCharArray();
        Arrays.sort(X_chars);
        X = new StringBuilder(new String(X_chars)).reverse().toString();

        // Y 문자열의 각 문자의 등장 횟수를 기록하는 Map을 생성
        Map<Character, Integer> yMap = new HashMap<>();
        for (char c : Y.toCharArray()) {
            yMap.put(c, yMap.getOrDefault(c, 0) + 1); //yMap에 c가 있으면 c의 value반환+1, 없으면 0 반환+1
        }

        // X 문자열을 순회하면서 Y에 포함된 문자와 겹치는 문자찾기
        for (char x : X.toCharArray()) {
            if (yMap.containsKey(x) && yMap.get(x) > 0) { 
                temp.append(x); 
                yMap.put(x, yMap.get(x) - 1); // 사용했으면, c의 개수 -1
            }
        }
        
        String str = temp.toString();
        if (str.length() == 0) { // 공통문자가 없다면 -1을 반환
            return "-1";
        } else if (str.matches("^[0]+$")) { // 공통문자가 모두 0이라면 "0" 한개로 반환
            return "0";
        } else { // 그 외 숫자는 그대로 반환
            return str;
        }
    }
}
