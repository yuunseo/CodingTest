import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int ing = scanner.nextInt();
        
        //완료 시각 출력하기
        int total_minute = hour*60 + minute + ing;
        hour = (total_minute/60) % 24;
        minute = total_minute%60;
               
        System.out.println(hour+" "+minute);
        
        
    }
}
