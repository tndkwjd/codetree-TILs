import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0; 
        for(int i = 1; i <= 10; i++){
          if(i % 2 == 1){
            cnt++;
          }
        }
        System.out.println(cnt);
    }
}