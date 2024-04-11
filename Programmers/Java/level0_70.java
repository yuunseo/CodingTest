import java.util.*;

class Solution {
    public int solution(String binomial) {
        String left="";
        String right="";
        String chr ="";
        String set = "+-*";
        
        for(int i=0; i<binomial.length(); i++){
            if(Character.isDigit(binomial.charAt(i)) && chr.length()==0) left+=binomial.charAt(i); // 숫자이면서, 좌항일 경우
            else if(set.contains(binomial.charAt(i)+"")) chr=binomial.charAt(i)+""; // 연산자 중 하나라면
            else if(Character.isDigit(binomial.charAt(i)) && chr.length()!=0) right+=binomial.charAt(i); // 숫자이면서, 우항일 경우
            else continue; // 공백은 무시
        }

        switch(chr){
            case "+":
                return Integer.parseInt(left)+Integer.parseInt(right);
            case "-":
                return Integer.parseInt(left)-Integer.parseInt(right);
            case "*":
                return Integer.parseInt(left)*Integer.parseInt(right);
        }
        
        return 0;
    }
}
