class Solution {
    public String solution(String my_string, int num1, int num2) {
        /*
        1. num1, num2의 문자를 저장
        2. my_string에서 하나씩 접근하면서, num1과 num2를 변경하여 result 생성
        */
        char temp1 = my_string.charAt(num1);
        char temp2 = my_string.charAt(num2);
        
        String result = "";
        for(int i=0; i<my_string.length(); i++){
            if(i==num1) result+=temp2;
            else if(i==num2) result+=temp1;
            else result+=my_string.charAt(i);
        }
        return result;
    }
}
