class Solution {
    public int solution(int n) {
        //1. 약수의 개수 찾기(나머지가 안남는 수)
        //2. 약수의 개수 >= 3인 합성수의 개수 찾기
        int answer = 0;
        for(int i=1; i<=n; i++){
            answer += getDivisor(i);
        }
        return answer;
    }
    
    public int getDivisor(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                count ++;   
            }
        }
        return (count>=3) ? 1 : 0;
    }
    
}
