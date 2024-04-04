import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 리스트를 생성해서, arr 값을 반복한다
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                list.add(arr[i]);
            }
        }
        // 배열을 생성해서, 반환을 위해 만들어주자
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
