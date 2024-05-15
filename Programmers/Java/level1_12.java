import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        /*
        1. ext 속성 중 val_ext보다 작은 값들만 추출해서 temp 2차원 배열에 저장한다.
        2. temp 2차원 배열에서 sort_by 속성을 기준으로 정렬한 2차원 배열을 return한다.
        */
        
        String[] col = {"code", "date", "maximum", "remain"};
        ArrayList<int[]> temp = new ArrayList<>();
        int index =  Arrays.asList(col).indexOf(ext);
        int sort_index = Arrays.asList(col).indexOf(sort_by);
        
        // ext값 추출
        for(int i=0; i<data.length; i++){
            if(data[i][index] < val_ext){
                temp.add(data[i]);
            }
        }
        // sort
        temp.sort(Comparator.comparingInt(a -> a[sort_index]));
        
        // 2차원 int 배열로 변환        
        int[][] answer = new int[temp.size()][];
        for (int i=0; i<temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        return answer;
    }
}
