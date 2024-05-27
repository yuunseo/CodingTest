import java.util.Scanner;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        char [][] matrix = new char[5][];
        int max_cols = 0;
        for(int i=0; i<5; i++){
            String temp = scanner.nextLine();
            matrix[i] = new char[temp.length()];
            max_cols = (max_cols<temp.length()) ? temp.length(): max_cols;
            for(int j=0; j<temp.length(); j++){
                matrix[i][j] = temp.charAt(j);
            }
        }
        
        StringBuilder result = new StringBuilder();
        for(int col = 0; col < max_cols; col++) {
            for(int row = 0; row < 5; row++) {
                if(col < matrix[row].length) {
                    result.append(matrix[row][col]);
                }
            }
        }
        System.out.println(result.toString());
	}
}
