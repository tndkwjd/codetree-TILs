import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s1 = sc.next().charAt(0);
        int c1 = sc.nextInt();
        char s2 = sc.next().charAt(0);
        int c2 = sc.nextInt(); 
        char s3 = sc.next().charAt(0);
        int c3 = sc.nextInt();
        if(s1 == 'Y' && c1 >= 37){
            if((s2 == 'Y'&& c2 >= 37) || s3 == 'Y' && c3 >= 37){
                System.out.println("E");
            }else{
                System.out.println("N");
            }
        }
        else{
            if((s2 == 'Y' && c2 >= 37) && (s3 == 'Y' && c3 >= 37)){
                System.out.println("E");
            }else{
                System.out.println("N");
            }
        }
    }
}