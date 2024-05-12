import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] nums = new int[42]; // 42로 나누면, 가능한 나머지는 1부터 41(0부터 41 인덱스 필요)
        
        for(int i=0; i<10; i++){
            int a = scanner.nextInt();
            nums[a%42] =1;
        }
        
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1) count+=1;
        }
        System.out.println(count);
        
	}
}
