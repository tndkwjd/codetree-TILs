import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double real_number = a + b;
        if(real_number >= 1.0){
            System.out.println("High");
        }else if(real_number >= 0.5){
            System.out.println("Middle");
        }else{
            System.out.println("Low");
        }
    }
}