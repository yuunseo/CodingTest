package Programmers.Java;

public class level0_41 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int center_val = (int)total/num;
        int center_idx = (int)num/2;

        if(num%2!=0){ //num이 홀수인 경우,
            //중간~끝
            for(int i=center_idx; i<num; i++){
                answer[i] = center_val;
                center_val++;
            }
            center_val = (int)total/num;
            center_idx = (int)num/2;
            //시작~중간
            for(int i=center_idx; i>=0; i--){
                answer[i] = center_val;
                center_val--;
            }



        }else{ //num이 짝수인 경우,
            center_val = (int)total/num+1;
            //중간~끝
            for(int i=center_idx; i<num; i++){
                answer[i] = center_val;
                center_val++;
            }
            center_val = (int)total/num+1;
            center_idx = (int)num/2;
            //시작~중간
            for(int i=center_idx; i>=0; i--){
                answer[i] = center_val;
                center_val--;
            }

        }


        return answer;
    }
}
