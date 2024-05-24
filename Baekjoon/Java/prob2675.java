import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int case_num = scanner.nextInt();
        StringBuilder str_result = new StringBuilder();
        
        for(int i=0; i<case_num; i++){
            int num = scanner.nextInt();
            String str = scanner.nextLine().trim();

            for(int j=0; j<str.length(); j++){
                for(int k=0; k<num; k++){
                    str_result.append(str.charAt(j));
                }
            }
            System.out.println(str_result.toString());
            str_result.setLength(0);
        }

	}
}
