class Solution {
    public String solution(String s, String skip, int index) {
        /*
        1. 문자열 s에서 char를 하나씩 가져온다.
        2. 해당 char에서 +index를 한 char를 가져온다.
            2-1. char에 +1(아스키코드)씩 해서 다음 문자로 넘어간 후, (char) 형변환을 통해 문자를 가져온다.
            2-2. 다음 char로 넘어갈 때, 해당 char가 문자열 skip에 포함되는지 확인한다.
            2-3. skip에 포함된다면, count하지 않는다.
            2-4. skip에 포함되지 않는다면 count하기 위해 index를 하나씩 줄인다.
        3. index가 0이 될 때, result에 최종 char를 추가한다.
        */
        
        String result = ""; // 정답을 담을 문자열 result
        
        for(int i=0; i<s.length(); i++){
            char chr = s.charAt(i); // while문에서 하나씩 증가시킬 것이므로, 새로운 변수에 복사해서 사용한다.
            int idx = index; // while문에서 index를 줄여줄 것이므로, 새로운 변수에 복사해서 사용한다.
            
            while(idx>0){
                chr = (chr+1)>122 ? (char)((chr+1)-26) : (char)(chr+1); // 아스키코드이므로, z(122)를 넘어가는 수를 고려한다!
                if(skip.contains(Character.toString(chr))) continue; // 만약 문자열 skip에 포함되는 문자라면, count하지 않고 다음 단어로 넘어간다.
                else idx--; // 만약 문자열 skip에 포함되지 않는 문자라면, count하기 위해서 idx를 하나 줄인다.
            }
            
            //System.out.println(chr);
            result += chr; // 최종 문자는 result에 추가한다.
        }
        return result;
    }
}
