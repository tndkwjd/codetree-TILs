import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0; 
        for(int i = a; i < 10; i++){
            int num = sc.nextInt();
            if(num >= 1 && num <= 500){
              if(num % 2 != 0){
                 cnt++;
              }
            }
        }
        System.out.println(cnt);
    }
}