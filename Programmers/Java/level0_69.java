class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        // Identity Matrix 생성 -> i==j에서 1의 값을 가진다.
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j) answer[i][j]=1;
            }
        }
        return answer;
    }
}
