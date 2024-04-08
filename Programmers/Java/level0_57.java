class Solution {
    public int solution(int[][] arr) {
        /* 모든 경우의 수 출력해보기
        System.out.println("i j arr[i][j] arr[j][i]");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println(i+" "+j+" "+arr[i][j]+" "+arr[j][i]);
            }
        }*/
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                // 하나라도 서로 다른 값이 있다면, 0을 반환
                if(arr[i][j]!=arr[j][i]){
                    return 0;
                }
            }
        }
        // 모두 같다면 1을 반환
        return 1;
    }
}
