import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        /*
        1. X에서 한 글자씩 가져온다.
        2. 가져온 글자를 Y에 포함되는지 확인한다.
        3. 포함된다면 해당 글자를 Y에서 지우고 반복한다.
        4. 포함되지 않는다면 다시 X에서 가져오기를 반복한다.
        5. 공통인 글자는 temp 변수에 저장한다.
        6. temp에 저장된 숫자가 없다면 -1반환
        7. tmep에 저장된 숫자가 있다면 내림차순으로 정렬하여 반환
        */
        
        StringBuilder temp = new StringBuilder(); // 공통 문자를 저장하기 위한 문자열 변수 temp
        for(int i=0; i<X.length(); i++){
            
            if(Y.contains(Character.toString(X.charAt(i)))){
                temp.append(X.charAt(i)); // 공통 문자 따로 저장
                Y = Y.replaceFirst(Character.toString(X.charAt(i)),""); // 한번 센 숫자는 제외하기 위해 삭제
            }else{
                continue; // 다음 문자로 이동
            }
        }
        
        // StringBuilder를 String으로 변환하여 내림차순으로 정렬
        String sortedString = temp.toString();
        char[] chars = sortedString.toCharArray();
        Arrays.sort(chars);
        sortedString = new StringBuilder(new String(chars)).reverse().toString();
        
        // 아무것도 없는 경우 -1 반환, 0만 존재하는 경우 0 하나만 남기기 위해 parse int
        int answer = sortedString.equals("") ? -1 : Integer.parseInt(sortedString);
        
        // string으로 반환하기 위해 +""
        return answer+"";

    }
}
