class Solution {
    public int solution(int[] box, int n) {
        /*
        1. 가로/주사위길이 = 가로에 들어갈 수 있는 개수
        2. 세로/주사위길이 = 세로에 들어갈 수 있는 개수
        3. if(가로 수용개수 * 세로 수용개수 >= 높이의 길이) = 1층 수용개수
        4. 높이의 길이/주사위 길이 = 높이 수용개수
        5. return 가로 개수* 세로 개수* 높이 개수
        */
        int width = (int)box[0]/n;
        int depth = (int)box[1]/n;
        int height = (int)box[2]/n;
        return width*depth*height;
    }
}
