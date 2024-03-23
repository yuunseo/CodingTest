package Programmers.Java;

public class level0_38 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=50 & arr[i]%2==0) answer[i]=arr[i]/2; //50이상 짝수
            else if(arr[i]<50 & arr[i]%2!=0) answer[i]=arr[i]*2; //50미만 홀수
            else answer[i]=arr[i]; //그 외
        }
        return answer;
    }
}
