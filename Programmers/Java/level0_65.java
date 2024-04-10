class Solution {
    public int[] solution(int[] numbers, String direction) {
        /*
        1. right일 경우, numbers의 마지막 원소를 temp변수에 저장해둔다.
        1-2. 이후 마지막에서부터 거꾸로 접근하며, 다음 인덱스에 저장한다.
        (i=length > i-1값을 i로 이동 > i-2값을 i-1로 이동 > ...)
        1-3. 0번째 원소까지 실행하고나면, for문을 나옴
        1-4. temp를 0번째 원소에 넣어주고 종료.
        
        2. left의 경우, numbers의 첫번째 원소를 temp변수에 저장해 둔다.
        3. right와 같은 방식 반대 로직으로 실행한다.
        */
        
        int[] answer = new int[numbers.length];
        int temp = (direction.equals("right")) ? numbers[numbers.length-1] : numbers[0];

        if(direction.equals("right")){
            for(int i=numbers.length-1; i>0; i--){
                answer[i] = numbers[i-1];
                System.out.println(answer[i]);
            }
            answer[0] = temp;
        }else{
            for(int i=0; i<numbers.length-1; i++){
                answer[i] = numbers[i+1];
                System.out.println(answer[i]);
            }
            answer[numbers.length-1] = temp;
        }
        
        return answer;
    }
}
