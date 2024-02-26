import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if(m >= 3 && 5 <= m){
            System.out.println("Spring");
        }else if(m >= 6 && 8 <= m){
            System.out.println("Summer");
        }else if(m >= 9 && 11 <= m){
            System.out.println("Fall");
        }else { 
            System.out.println("Winter");
        }
    }
}