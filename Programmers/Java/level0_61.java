import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        /*
        1. 가장 큰 두 음수의 곱
        2. 가장 큰 두 양수의 곱
        3. numbers를 정렬한 이후, 맨 뒤 2자리의 곱 vs 맨 앞 2자리의 곱 중 더 큰 수 반환
        */
        Arrays.sort(numbers);
        int temp1 = numbers[0]*numbers[1];
        int temp2 = numbers[numbers.length-1]*numbers[numbers.length-2];
        return (temp1>temp2) ? temp1 : temp2;
    }
}
