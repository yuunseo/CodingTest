import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int[] num_list = {a,b,c};
        int[] result = {0,0,0,0,0,0,0};
        
        for(int num: num_list){
            result[num]++;
        }
        
        int max=0;
        int answer=0;
        
        for(int i=1; i<7; i++){
            if(result[i]==3){
                answer=10000+i*1000;
                break;
            }else if(result[i]==2){
                answer=1000+i*100;
                break;
            }else if(result[i]==1){
                max = max < i ? i : max;
            }
            answer = max*100;
        }
        
        System.out.println(answer);
       
        
    }
}
