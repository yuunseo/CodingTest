class Solution {
    public int solution(String myString, String pat) {
        // A와 B를 서로 바꿀 문자열 temp
        String temp="";
        
        for(int i=0; i<myString.length(); i++){
            // 하나씩 접근하면서, A라면 B로
            if(myString.charAt(i)=='A') temp+="B";
            // B라면 A로 변경하여 temp를 완성
            else temp+="A";
        }
        
        // temp에 pat 문자열이 포함되면 1 아니면 0
        return (temp.contains(pat)) ? 1 : 0;
    }
}
