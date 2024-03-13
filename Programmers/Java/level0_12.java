package Programmers.Java;

public class level0_12 {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String word : babbling) {
            int count=4;
            StringBuilder str = new StringBuilder(word);
            while (count >= 0) {
                if (str.toString().startsWith("aya")) str.delete(0, 3);
                else if (str.toString().startsWith("ye")) str.delete(0, 2);
                else if (str.toString().startsWith("woo")) str.delete(0, 3);
                else if (str.toString().startsWith("ma")) str.delete(0, 2);
                count--;

                if (str.length() == 0){answer++; break;}
                else if(count==0 & str.length()!=0) break;
            }

        }
        return answer;
    }
}
