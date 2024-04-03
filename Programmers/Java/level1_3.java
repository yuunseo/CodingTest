import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 완주자 명단에서 선수를 비교하기 위해 List로 변경
        List<String> strList = new ArrayList<>(Arrays.asList(completion));
        // 참여 선수 명단에 한 명씩 접근하면서,
        for(String name: participant){ 
            // 만약, 완주자 명단에 선수 이름이 있다면 제외
            if(strList.contains(name)) strList.remove(name);
            else{ // 완주자 명단에 선수 이름이 없다면 return
                return name;
            }
        }
        return "";
    }
}
