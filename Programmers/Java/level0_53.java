class Solution {
    public int[] solution(int[] array) {
        
        // 최댓값과 그 값의 인덱스 변수 생성
        int max=-1;
        int idx=-1;
        // 최댓값과 그 값의 인덱스 찾기 for문
        for(int i=0; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
                idx=i;
            }
        }
        // result 배열 생성
        int[] answer = {max,idx};
        return answer;
    }
}
