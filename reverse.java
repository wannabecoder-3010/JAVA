import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int original = n;
        while(n!=0){
            int lastdigit = n%10;
            rev = rev*10;
            rev = rev + lastdigit;
            n = n / 10;
        }
        System.out.println(rev);
        System.out.println(rev + original);
        sc.close();

    }
}
