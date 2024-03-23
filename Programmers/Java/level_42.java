package Programmers.Java;

public class level_42 {
    public int solution(int[] common) {
        int answer = 0;
        for(int i=0; i<common.length-2; i++){
            int d1 = common[i+1] - common[i];
            int d2 = common[i+2] - common[i+1];
            if(d1==d2){ //등차수열
                return common[common.length-1]+d1;
            }
            int r1 = common[i+1] / common[i];
            int r2 = common[i+2] / common[i+1];
            if(r1==r2){ //등비수열
                return common[common.length-1]*r1;
            }
        }
        return answer;
    }

}
