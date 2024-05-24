import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String[] alpha = {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        String str = scanner.nextLine();
        int count =0;
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<alpha.length; j++){
                String temp = alpha[j];
                if(temp.contains(str.charAt(i)+"")){
                    count += j+1;
                }
            }
        }
        System.out.println(count);

	}
}
