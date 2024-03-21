package Programmers.Java;

public class level0_31 {
    public int solution(String my_string) {
        int answer = 0;
        for(int i=0; i<my_string.length(); i++){
            if(Character.isLetter(my_string.charAt(i))) continue;
            else answer += Character.getNumericValue(my_string.charAt(i));
        }
        return answer;
    }
}
