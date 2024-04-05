class Solution {
    public String solution(String[] str_list, String ex) {
        /*
        1. str_list에 담긴 원소들을 하나의 string으로 합친다(+연산으로 가능)
        2. str_list의 원소 중 ex 문열을 포함하는 지 확인한다.
        3. 포함하면 continue 포함하지 않으면 plus
        */
        String answer = "";
        for(String str: str_list){
            if(str.contains(ex)) continue;
            else answer+=str;
        }
        return answer;
    }
}
