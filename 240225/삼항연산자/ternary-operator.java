import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        int tmp; 
        tmp = score == 100 ? 0 : 1;
        if(tmp == 0){
            System.out.println("pass");
        }else{
            System.out.println("failure");
        }
    }
}