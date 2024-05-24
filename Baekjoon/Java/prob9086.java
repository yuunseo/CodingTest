import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int case_num = scanner.nextInt(); //nextInt는 숫자만 읽고 줄 바꿈 문자를 남기기 때문에, nextLine은 빈 문자열을 읽게 됨. 
        scanner.nextLine(); //줄 바꿈 문자를 없애준 후, String scan
        for(int i=0; i<case_num; i++){
            String S = scanner.nextLine();
            System.out.println(S.charAt(0)+""+S.charAt(S.length()-1));
        }
                
	}
}
