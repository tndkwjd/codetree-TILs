import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a >= 90) ? ((b >= 95 || b >= 90) ? 100000 : 50000) : 0);
    }
}