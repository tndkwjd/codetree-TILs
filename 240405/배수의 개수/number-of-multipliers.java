import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0; 
        int b = 0; 
        for(int i = 1; i <= 10; i++){
            int cnt = sc.nextInt();
            if(cnt % 3 == 0){
                a++;
            }
            if(cnt % 5 == 0){
                b++;
            }
        }
        System.out.println(a + " " + b);
    }
}