import java.util.Scanner;
public class loops3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        for(int i=a;i<=b;i++){
            System.out.println(i);
        }  
        sc.close();                        
    }
}
