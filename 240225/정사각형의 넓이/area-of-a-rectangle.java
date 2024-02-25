import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = n * n;
        System.out.println(tmp);
        if(tmp < 5)
        System.out.println("tiny");
    }
}