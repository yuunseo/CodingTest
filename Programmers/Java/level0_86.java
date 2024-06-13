class Solution {
    public String solution(String my_string, int m, int c) {
        String[] temp = {"","","",""};
        int idx = 0;
        int repeat_num = (int)(my_string.length()/m);
        
        for(int i=0; i<repeat_num; i++){
            for(int j=0; j<m; j++){
                temp[j] += my_string.charAt(idx);
                idx++;
            }
        }
        
        return temp[c-1];
    }
}
