import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int [] baskets = new int[N];
        for(int i=0; i<baskets.length; i++){
            baskets[i]=i+1;
        }// 1,2,3,4,5가 담긴 바구니

        for(int order=0; order<M; order++){ //총 M번 바꾸기시도
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            //i부터 j번 바구니를 역순으로 바꾸기
            //양 끝을 대칭적으로 바꾸므로, start<end에서 종료하면 됨
            for (int start = i - 1, end = j - 1; start < end; start++, end--) {
                int temp = baskets[start];
                baskets[start] = baskets[end];
                baskets[end] = temp;
            }

        }
        for(int num: baskets){
            System.out.print(num+" ");
        }

	}
}
