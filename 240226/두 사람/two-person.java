import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aS = sc.nextInt();
        char aG = sc.next().charAt(0);
        int bS = sc.nextInt();
        char bG = sc.next().charAt(0);
        System.out.println((aS >= 19 && aG == 'M') || (bS >= 19 && bG == 'M') ? 1:0);
    }
}