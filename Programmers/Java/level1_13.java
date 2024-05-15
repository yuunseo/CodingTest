import java.util.HashMap;

class Solution {
    public static void addValue(HashMap<Character, Integer> map, char key, int valueToAdd) {
        if (map.containsKey(key)) {
            map.put(key, map.get(key) + valueToAdd); 
        } else {
            map.put(key, valueToAdd); 
        }
    }

    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String[] personality = {"RT","CF","JM","AN"};
        HashMap< Character, Integer> map = new HashMap<>();
        for(int i=0; i<personality.length; i++){
            map.put(personality[i].charAt(0),0);
            map.put(personality[i].charAt(1),0);
        }


        for(int i=0; i<survey.length; i++){
            int score=0;
            char chr='a';

            if(choices[i]<4){ // 4 미만일 경우, 성격 유형은 survey.charAt(0) 
                score = 4-choices[i];
                chr = survey[i].charAt(0);
                addValue(map, chr, score);
            }else if(choices[i]>4){// 4 초과일 경우, 성격 유형은 survey.charAt(1)
                score = choices[i]-4;
                chr = survey[i].charAt(1);
                addValue(map, chr, score);
            }// 4인 경우, 그대로
        }

        for(int i=0; i<personality.length; i++){
            char num1 = personality[i].charAt(0);
            char num2 = personality[i].charAt(1);
            answer += (map.get(num1)>= map.get(num2) ? num1 : num2);
        }

        return answer;     
    }
}
