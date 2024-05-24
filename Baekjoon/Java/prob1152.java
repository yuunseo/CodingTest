import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();

      //문자열이 공백으로 시작하고 끝나는 경우, 공백으로 구성된 array > length=1이 되므로 처리해주기.
        if(str.equals(" ")){
            System.out.println(0);
            return;
        }
        System.out.println(str.split(" ").length);

	}
}
