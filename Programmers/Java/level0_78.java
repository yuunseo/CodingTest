
class Solution {
    public int solution(String number) {
        int answer = 0;
        // number의 각 자리의 수끼리 더한 answer
        for(int i=0; i<number.length(); i++){
            answer += (number.charAt(i)-'0');
        }
        
        return answer%9;
    }
}
