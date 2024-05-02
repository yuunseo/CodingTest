class Solution {
    public int solution(int[] ingredient) {
        int count=0;
        
        //빵-야채-고기-빵을 담기 위한 stringbuilder
        StringBuilder str = new StringBuilder();
        for(int num: ingredient){
            str.append(num);
        }
        String string = str.toString();
        
        //재료들 중 올바른 순서대로 쌓았다면 count++하고, 햄버거로 탈출
        while(true){
            if(string.contains("1231")){
                count+=1;
                string = string.substring(0,string.indexOf("1231") )+string.substring(string.indexOf("1231")+4 );
            }else{
                break;
            }
        }
        
        return count;
    }
}
