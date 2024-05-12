import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] num_list = new int[num];

        for(int i=0; i<num; i++){
            num_list[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int count=0;
        for(int a: num_list){
            if(a==target) count+=1;
        }
        System.out.println(count);
        
	}
}
