class Solution {
    public int solution(int order) {
        int answer = 0;
        String num_order = order+"";
        for(int i=0; i<num_order.length(); i++){
            int num = num_order.charAt(i)-'0';
            if(num==3 || num==6 || num==9){
                answer ++;
            }
        }
        return answer;
    }
}
