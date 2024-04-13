import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        
        //45분 일찍 알람 설정하기
        int new_minute = minute-45;
        int new_hour = new_minute<0 ? hour-1 : hour;
        new_minute = new_minute<0 ? new_minute+60 : new_minute;
        new_hour = new_hour<0 ? new_hour+24 : new_hour;
               
        System.out.println(new_hour+" "+new_minute);
        
        
    }
}
