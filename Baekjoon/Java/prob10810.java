import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int total_basket = scanner.nextInt();
        int try_count = scanner.nextInt();
        int [] baskets = new int[total_basket];
        for(int i=0; i<baskets.length; i++){
            baskets[i]=0;
        }

        for(int order=0; order<try_count; order++){
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            for(int start = i-1; start < j; start++){
                baskets[start] = k;
            }
        }
        for(int num: baskets){
            System.out.print(num+" ");
        }
        
	}
}
