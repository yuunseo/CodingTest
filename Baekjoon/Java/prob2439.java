import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(String.format("%" + num + "s", "*".repeat(i))); //num은 자릿수, s는 string, 오른쪽 정렬은 default
        }
    }
}
