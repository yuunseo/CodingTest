package Programmers.Java;

import java.util.ArrayList;


public class level1_2 {
    public static int scoreResult(int num, char alpha) {
        if (alpha == 'S') { // Single의 경우, 1제곱
            return num;
        } else if (alpha == 'D') { // Double의 경우, 2제곱
            return num * num;
        } else { // Triple의 경우, 3제곱
            return num * num * num;
        }
    }

    public static int solution(String dartResult) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Character> answer = new ArrayList<>();

        for (int i = 0; i < dartResult.length(); i++) {
            //하나씩 불러와서 접근하기
            char score = dartResult.charAt(i);
            //스타상(*)
            if (score == '*') {
                if (result.size() == 1) {
                    result.set(result.size() - 1, result.get(result.size() - 1) * 2);
                } else {
                    result.set(result.size() - 1, result.get(result.size() - 1) * 2);
                    result.set(result.size() - 2, result.get(result.size() - 2) * 2);
                }
            } // 아차상(#)
            else if (score == '#') {
                result.set(result.size() - 1, result.get(result.size() - 1) * (-1));
            } // 그 외
            else {
                answer.add(score);
                if (Character.isAlphabetic(score)) {
                    // 맨 마지막 글자(알파벳) 제외한 문자 모두 가져와서 문자열로 변환
                    int num = Integer.parseInt(answer.subList(0, answer.size() - 1).stream().map(String::valueOf).reduce("", String::concat));
                    // 맨 마지막 글자(알파벳) 점수 처리
                    result.add(scoreResult(num, answer.get(answer.size() - 1)));
                    answer.clear();
                }
            }
        }

        // 최종 점수
        int sum = 0;
        for (int score : result) {
            sum += score;
        }
        return sum;
    }
}
