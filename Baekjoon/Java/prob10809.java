import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String str =scanner.nextLine();
        
        int[] alpha_array = new int[26];
        Arrays.fill(alpha_array,-1);
        
        for(int i = 0; i<str.length(); i++){
            if(alpha_array[(int)str.charAt(i) - 'a']==-1){
                alpha_array[(int)str.charAt(i) - 'a']=i;
            }
        }
        
        for(int num: alpha_array){
            System.out.print(num+" ");
        }

	}
}
