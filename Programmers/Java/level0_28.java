package Programmers.Java;

public class level0_28 {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<n; j++) answer += my_string.charAt(i);
        }
        return answer;
    }
}
