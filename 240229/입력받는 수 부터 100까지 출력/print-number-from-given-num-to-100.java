import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 100){
            for(int i = n; i <= 100; i++){
                System.out.print(i + " ");
            }
        }
    }
}