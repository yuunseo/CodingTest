package Programmers.Java;

public class level0_18 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer =  Arrays.copyOfRange(numbers,num1,num2+1);
        return answer;
    }
}
