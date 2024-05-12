import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int limit = scanner.nextInt();
        int[] num_list = new int[num];

        for(int i=0; i<num; i++){
            num_list[i] = scanner.nextInt();
        }
        
        for(int a: num_list){
            if(a<limit) System.out.println(a);
        }
        
	}
}
