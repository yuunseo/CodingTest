import java.util.Scanner;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        int [][] matrix = new int[9][9];
        int max = -1;
        HashMap<Integer, String> map = new HashMap<>();
        map.put(max,"--");
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                matrix[i][j] = scanner.nextInt();
                if(max<matrix[i][j]){
                    max = matrix[i][j];
                    map.put(max, i+""+j);
                }
            }
        }
        
        System.out.println(max);
        String location = map.get(max);
        int loca_index = Integer.parseInt(Character.toString(location.charAt(0)));
        loca_index += 1;
        int loca_index2 = Integer.parseInt(Character.toString(location.charAt(1)));
        loca_index2 += 1;
        System.out.println(loca_index+" "+loca_index2);
	}
}
