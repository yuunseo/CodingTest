import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int max_num=1;
        int max_index=0;
        
        for(int i=0; i<9; i++){
            int a = scanner.nextInt();
            if(a>max_num){
                max_num=a;
                max_index=i;
            }
        }
        System.out.println(max_num);
        System.out.println(max_index+1);
        
	}
}
