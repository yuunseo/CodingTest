class Solution {
    public int solution(int a, int b) {
        // 모두 홀수인 경우
        if(a%2!=0 && b%2!=0){
            return (int)(Math.pow(a,2)+Math.pow(b,2));
        }// 둘 중 하나만 홀수인 경우
        else if(a%2!=0 || b%2!=0){
            return 2*(a+b);
        }// 모두 홀수가 아닌 경우
        else{
            return Math.abs(a-b);
        }
    }
}
