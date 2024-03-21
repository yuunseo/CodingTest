package Programmers.Java;

public class level0_29 {
    public String solution(String my_string) {
        String aeiou = "aeiou";
        String answer = "";

        for(int i=0; i<my_string.length(); i++){
            if(aeiou.contains(Character.toString(my_string.charAt(i)))) continue;
            else answer += my_string.charAt(i);
        }

        return answer;
    }
}
