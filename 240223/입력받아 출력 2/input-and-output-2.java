import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, a, b; 
        str = sc.nextLine();
       
        String[] arr = str.split("-");
		a = arr[0];
		b = arr[1];
		System.out.println(a + b);
    }
}