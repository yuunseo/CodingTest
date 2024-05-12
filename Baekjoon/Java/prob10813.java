import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int [] baskets = new int[N];
        for(int i=0; i<baskets.length; i++){
            baskets[i]=i+1;
        }

        for(int order=0; order<M; order++){
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int temp = baskets[i-1];
            baskets[i-1] = baskets[j-1];
            baskets[j-1] = temp;
        }
        for(int num: baskets){
            System.out.print(num+" ");
        }
        
	}
}
