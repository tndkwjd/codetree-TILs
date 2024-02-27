import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = 0;
        if(m == 2){
            if(y % 4 == 0 && (y % 100 != 0 || y % 400 == 0)){
                System.out.println(29);
            }else{
                System.out.println(28);
            }
        }else if(m == 4 || m == 6 || m == 9 || m == 11){
            System.out.println(30);
        }else{
            System.out.println(31);
        }
    }
}