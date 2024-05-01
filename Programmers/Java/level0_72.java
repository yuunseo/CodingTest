import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        ArrayList <Integer> intList = new ArrayList<>();
        for(int i=0; i<intervals.length; i++){
            for(int j=intervals[i][0]; j<=intervals[i][1]; j++){
                intList.add(arr[j]);
            }
        }
        
        int[] answer = new int[intList.size()];
        for(int i=0; i<intList.size(); i++){
            //System.out.println(intList.get(i));
            answer[i] = intList.get(i);
        }
        
        return answer;
    }
}
