import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        scanner.nextLine();
        String nums =scanner.nextLine();
        
        String[] nums_array = nums.split("");
        int sum=0;
        for(String str : nums_array){
            sum += Integer.parseInt(str);
        }
        System.out.println(sum);

	}
}
