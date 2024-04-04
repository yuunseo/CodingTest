class Solution {
    public String[] solution(String my_string) {
        // 앞뒤 공백 제거 + 중복되는 공백 제거
        my_string=my_string.trim().replaceAll("\\s+", " ");
        // 공백을 기준으로 구분
        return  my_string.split(" ");
    }
}
