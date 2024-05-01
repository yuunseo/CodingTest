import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        ArrayList <String> strList = new ArrayList<>();
        for(String str: answer){
            if(str.equals("")){
                continue;
            }else{
                strList.add(str);
            }
        }
        String[] resultArr = strList.toArray(new String[strList.size()]);
        Arrays.sort(resultArr);
        
        return resultArr;
    }
}
