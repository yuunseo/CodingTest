import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        /*
        1. X에서 한 글자씩 가져온다. > 정렬 & 내림차순으로 for문 접근
        2. 가져온 글자를 Y에 포함되는지 확인한다.
        3. 포함된다면 해당 글자를 Y에서 지우고 반복한다.
        4. 포함되지 않는다면 다시 X에서 가져오기를 반복한다.
        5. 공통인 글자는 temp 변수에 저장한다.
        6. temp에 저장된 숫자가 없다면 -1반환
        7. tmep에 저장된 숫자가 있다면 숫자 반환
        */
        
        String temp="";
        
        String[] X_temp = X.split("");
        Arrays.sort(X_temp);
        
        for(int i=X_temp.length-1; i>=0; i--){
            if(Y.contains(X_temp[i])){
                temp += X_temp[i];
                Y = Y.replaceFirst(X_temp[i],"");
            }
        }
        
        if(temp.length()==0){ // 공통문자가 없다면 -"1" 반환
            return "-1";
        }else if(temp.matches("^[0]+$")){ // 공통문자가 모두 0이라면 "0" 한개로 반환
            return "0";
        }else{ // 그 외 숫자는 그대로 반환
            return temp;
        }
    }
    
}
