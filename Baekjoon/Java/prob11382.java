import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

      // 입력 예시: 7 77 777 -> int로 받는 범위를 초과하였으므로 long 타입으로 받는다.
        long a=scanner.nextLong();
        long b=scanner.nextLong();
        long c=scanner.nextLong();

        System.out.println(a+b+c);
    }
}
