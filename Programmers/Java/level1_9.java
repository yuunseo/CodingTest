class Solution {
    public int solution(int[] ingredient) {
        int count=0;
        
        //빵-야채-고기-빵을 담기 위한 stringbuilder
        StringBuilder str = new StringBuilder();
        for(int num: ingredient){
            str.append(num);
            //1-2-3-1 순서가 발견되면, count++ 후 햄버거로 탈출
            if(str.length()>3) {                             
                if(str.charAt(str.length()-1) == '1' &&      
                   str.charAt(str.length()-2) == '3' &&       
                   str.charAt(str.length()-3) == '2' &&      
                   str.charAt(str.length()-4) == '1') {
                    count+=1;
                    str = new StringBuilder(str.substring(0, str.length()-4)); 
                    }
                }
        }
    
        return count;
    }
}
