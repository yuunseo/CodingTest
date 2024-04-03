class Solution {
    public int count(String key, char chr){
        for(int i=0; i<key.length(); i++){
            // key에서 chr이 몇 번째 인덱스에서 나오는 지 확인
            if(key.charAt(i)==chr) return i;
        }
        // key에 chr이 없다면 -1을 반환
        return -1;
    }

    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] keyCount = new int[keymap.length];


        // targets에서 하나씩 가져오기
        for(int idx=0; idx<targets.length; idx++){
            // target에서 하나씩 가져오기
            for(int i=0; i<targets[idx].length(); i++){
                int min=999;
                int minusCount=0;
                //keymap에서 가져올 수 있는 횟수 비교하기
                for(int j=0; j<keymap.length; j++){
                    keyCount[j] = count(keymap[j],targets[idx].charAt(i));
                    // -1이 아닌 값들 중 가장 작은 수를 min으로 update
                    if(min>keyCount[j] && keyCount[j]!=-1) min=keyCount[j];
                    // -1일 경우, minusCount를 증가
                    else if(keyCount[j]==-1) {
                        minusCount++;
                    }
                }

                // minusCount가 keymap의 길이와 같다면, 모든 key에 원하는 target을 찾지 못했으므로 -1
                if(minusCount == keymap.length){
                    answer[idx] = -1;
                    break; // 다음 target으로 넘어가기
                }
                // 그 외, min+1만큼 눌러서 할당
                else answer[idx] += min+1; // 기존 target에서 이어서 진행하기
            }

        }
        return answer;
    }
}
