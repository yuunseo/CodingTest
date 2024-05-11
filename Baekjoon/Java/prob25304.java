import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int total_price = scanner.nextInt();
        int num = scanner.nextInt();
        
        for(int i=0; i<num; i++){
            int price = scanner.nextInt();
            int count = scanner.nextInt();
            total_price -= (price*count);
        }
        
        if (total_price==0) System.out.println("Yes");
        else System.out.println("No");
	}
}
