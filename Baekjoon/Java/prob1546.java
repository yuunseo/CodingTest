import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] counts = new int[count];
        
        double sum = 0;
        double max = 0;
        
        for(int i=0; i<count; i++){
            counts[i] = scanner.nextInt();
            if(counts[i]>max) max=counts[i];
        }
        
        for(int num: counts){
            sum += (double) num / max * 100;
        }
        System.out.println( (double)sum / count);

	}
}
