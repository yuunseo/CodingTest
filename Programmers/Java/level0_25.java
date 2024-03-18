package Programmers.Java;
import java.util.*;

public class level0_25 {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int answer = sides[2]<sides[0]+sides[1] ? 1 : 2;
        return answer;
    }
}
