class Solution {
    public String solution(int age) {
        /*
        행성 a~j(0~9)
        아스키코드 a~j(97~106)
        */
        String answer = "";
        String str_age=""+age; // 숫자로 들어온 age를 한 글자씩 접근하기 위해 string으로 변환

        for(int i=0; i<str_age.length(); i++){
            // age의 한 글자씩 가져와서, 해당 숫자에 +97를 더하면 알파벳으로 표현 가능
            answer+=(char)(str_age.charAt(i)-'0'+97);
        }
        return answer;
    }
}
