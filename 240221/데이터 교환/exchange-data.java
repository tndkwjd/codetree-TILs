public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;

        int tmp; 
        int tmp2; 
        int tmp3;

        tmp = a;
        tmp2 = b;
        tmp3 = c;

        // b -> a 값 
        b = tmp; 
        
        // c -> b값 
        c = tmp2; 

        // a -> c값 
        a = tmp3;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}