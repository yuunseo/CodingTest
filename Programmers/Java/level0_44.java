class Solution {
    public String solution(String n_str) {
        // 가장 왼쪽에 0이 등장한다면,
        if(n_str.startsWith("0")){
            int i=0;
            while(n_str.charAt(i)=='0'){ // 0이 몇 번째 인덱스까지 나오는지 찾아서
                i++;
            }
            return n_str.substring(i); // 그 이후 인덱스부터 문자열 잘라내기
        }else{
            return n_str; // 0으로 안 시작한다면, 그냥 반환
        }

    }
}
