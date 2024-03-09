package Programmers.Java;

public class level0_10 {
    public int solution(int[][] lines) {
        int overlap = 0;

        // 첫 번째 선분과 두 번째 선분의 겹치는 부분을 찾음
        int start1 = Math.max(lines[0][0], lines[1][0]);
        int end1 = Math.min(lines[0][1], lines[1][1]);
        int overlap1 = Math.max(0, end1 - start1);

        // 첫 번째 선분과 세 번째 선분의 겹치는 부분을 찾음
        int start2 = Math.max(lines[0][0], lines[2][0]);
        int end2 = Math.min(lines[0][1], lines[2][1]);
        int overlap2 = Math.max(0, end2 - start2);

        // 두 번째 선분과 세 번째 선분의 겹치는 부분을 찾음
        int start3 = Math.max(lines[1][0], lines[2][0]);
        int end3 = Math.min(lines[1][1], lines[2][1]);
        int overlap3 = Math.max(0, end3 - start3);

        // 모든 선분이 겹치는 부분을 찾음
        int startAll = Math.max(start1, Math.max(start2, start3));
        int endAll = Math.min(end1, Math.min(end2, end3));
        int overlapAll = Math.max(0, endAll - startAll);

        // 겹치는 부분의 길이를 더함
        overlap = overlap1 + overlap2 + overlap3 - overlapAll*2;

        return overlap;
    }
}
