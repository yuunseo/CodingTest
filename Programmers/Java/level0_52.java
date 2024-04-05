class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        /*
        1. parts를 하나씩 가져온다.
        2. parts의 원소에 맞는 인덱스 범위를 my_strings에 적용한다.
        */
        String answer = "";
        for(int i=0;i <parts.length; i++){
            answer += my_strings[i].substring(parts[i][0],parts[i][1]+1);
        }
        return answer;
    }
}
