import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] num_list = new int[num];

        for(int i=0; i<num; i++){
            num_list[i] = scanner.nextInt();
        }
        int min = 1000001;
        int max = -1000001;
        
        for(int a: num_list){
            if(a<min) min = a;
            if(a>max) max = a;
        }
        
        System.out.println(min+" "+max);
        
	}
}
