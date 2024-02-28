import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cold = sc.nextInt();
        if (cold >= 37)
            System.out.println("A");
        if(cold != 37)
            System.out.println("B");
        if(cold == 36)
            System.out.println("C");
        else
            System.out.println("D");
    }
}