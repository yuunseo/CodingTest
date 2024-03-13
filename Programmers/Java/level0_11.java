package Programmers.Java;
import java.util.*;

public class level0_11 {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;

        int[] intArray = new int[7];
        intArray[a]++;
        intArray[b]++;
        intArray[c]++;
        intArray[d]++;

        // 각 주사위의 나온 횟수 출력
        for(int i=1; i<=6; i++){
            System.out.println("주사위 " + i + ": " + intArray[i]);
        }

        // 주사위 값이 나온 횟수를 리스트로 변환
        List<Integer> intList = new ArrayList<>();
        for (int num : intArray) {
            intList.add(num);
        }

        if(intList.contains(4)) {
            for(int i=1; i<=6; i++){
                if(intArray[i] == 4) return 1111*i;
            }
        } else if(intList.contains(3) && intList.contains(1)){
            int p=0, q=0;
            for(int i=1; i<=6; i++){
                if(intArray[i] == 3) p=i;
                if(intArray[i] == 1) q=i;
            }
            return (int)Math.pow(10*p+q, 2);
        } else if(intList.contains(2) && Collections.frequency(intList, 2) == 2){
            int p=0, q=0;
            for(int i=1; i<=6; i++){
                if(intArray[i] == 2 && p == 0) p=i;
                if(intArray[i] == 2 && p != 0) q=i;
            }
            return (p+q) * Math.abs(p-q);
        } else if(intList.contains(2) && Collections.frequency(intList, 1) == 2){
            int p=0, q=0, r=0;
            for(int i=1; i<=6; i++){
                if(intArray[i] == 2) p=i;
                if(intArray[i] == 1 && q == 0) q=i;
                if(intArray[i] == 1 && q != 0) r=i;
            }
            return q*r;
        } else {
            int min = 6;
            for(int i=1; i<=6; i++){
                if(intArray[i] == 1 && i < min) min=i;
            }
            System.out.println("최소값: " + min);
            return min;
        }

        return answer;
    }
}
