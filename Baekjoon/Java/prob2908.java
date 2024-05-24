import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        StringBuilder A = new StringBuilder(scanner.next());
        StringBuilder B = new StringBuilder(scanner.next());
        int numA = Integer.parseInt(A.reverse().toString());
        int numB = Integer.parseInt(B.reverse().toString());
        int result = numA > numB ? numA : numB;
        System.out.println(result);

	}
}
