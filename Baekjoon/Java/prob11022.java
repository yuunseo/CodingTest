import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i=1; i<=num; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(String.format("Case #%d: %d + %d = %d", i, a, b,a + b));
        }
	}
}
