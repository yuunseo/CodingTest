import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        /*
        [방법1]
        1. arr에서 원하는 원소를 삭제하기 위해 list로 변경한다 .
        2. delete_list에서 원소를 하나씩 가져와, arr에 포함되어 있는지 확인하고 삭제한다.
        3. arr을 다시 배열로 변환하여 return
        [방법2]
        1. arr에서 원소를 하나씩 가져와서 delete_list에 포함되는지 확인한다.
        2. 포함된다면 pass, 포함 안된다면 answer 배열에 추가..를 하려면 어쨋든 길이를 알아야 하는 군.
        */
        
        // arr list 생성
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        // arr list에서 delete item 삭제
        for (int num : delete_list) {
            list.remove(Integer.valueOf(num));
        }
        // answer array 생성 후 반환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
