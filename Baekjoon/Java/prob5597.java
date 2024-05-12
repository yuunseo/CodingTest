import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] std_nums = new int[30];
        
        for(int i=0; i<28; i++){
            int a = scanner.nextInt();
            std_nums[a-1] = 1;
        }

        for(int i=0; i<std_nums.length; i++){
            if(std_nums[i]!=1) System.out.println(i+1);
        }
        
	}
}
