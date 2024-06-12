class Solution {
    public int solution(int hp) {
        //장군개미5 병정개미3 일개미1
        int answer = 0;
        answer += hp/5;
        hp = hp%5;
        if(hp>=3){
            answer += hp/3;
            hp = hp%3;
        }
        answer += hp;
        return answer;
    }
}
