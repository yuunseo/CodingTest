class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++){ 
            // 만약 'l'의 아스키 값보다 작은(l보다 앞서는) 문자일 경우, 'l'로 치환
            if(myString.charAt(i)<108) answer+="l";
            // 그 외의 경우, 그대로 
            else answer+=myString.charAt(i);
        }
        return answer;
    }
}
