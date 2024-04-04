class Solution {
    public int solution(int[] num_list) {
        int even=0;
        int odd=0;
        
        for(int i=0; i<num_list.length; i++){
            if(i%2==0) odd += num_list[i]; //홀수번째 원소
            else  even += num_list[i]; //짝수번째 원소
        }
        // 둘 중 더 큰 값을 반환
        return (even > odd) ? even : odd;
    }
}
