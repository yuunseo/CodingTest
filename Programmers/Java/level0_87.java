class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i=0; i<included.length; i++){

            //dn+(a-d)
            if(included[i] == true){
                answer += (d*(i+1)+(a-d));
            }
        }
        return answer;
    }
}
