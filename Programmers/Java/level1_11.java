class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder(); // 계속 추가할 것이므로 string 대신 stringbuilder
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}}; // 0은 키패드 상에서 11번째에 위치
        
        int[] left = {3,0}; // * 위치
        int[] right = {3,2}; // # 위치
        
        for (int number: numbers) {
            int row = -1;
            int col = -1;
            // 키패드에서 숫자의 위치(index) 찾기
            for (int r = 0; r < nums.length; r++) {
                for (int c = 0; c < nums[r].length; c++) {
                    if (nums[r][c] == number) {
                        row = r;
                        col = c;
                        break;
                    }
                }
                if (row != -1) {
                    break;
                }
            }
            if (number == 1 || number == 4 || number == 7) {
                answer.append("L");
                left[0] = row;
                left[1] = col;
            } else if (number == 3 || number == 6 || number == 9) {
                answer.append("R");
                right[0] = row;
                right[1] = col;
            } else { // number가 2, 5, 8, 0인 경우
                int leftDistance = Math.abs(row - left[0]) + Math.abs(col - left[1]);
                int rightDistance = Math.abs(row - right[0]) + Math.abs(col - right[1]);
                if (leftDistance < rightDistance || (leftDistance == rightDistance && hand.equals("left"))) {
                    answer.append("L");
                    left[0] = row;
                    left[1] = col;
                } else {
                    answer.append("R");
                    right[0] = row;
                    right[1] = col;
                }
            }
        }
        return answer.toString();
    }
}
