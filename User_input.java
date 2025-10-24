import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter number 1");
        //int a = sc.nextInt();
      //  System.out.println("Enter number 2");
      //  int b = sc.nextInt();

        //int sum = a + b;
        //System.out.println("Sum of these numbers is:");
        //System.out.println(sum);
     //   boolean b1 = sc.hasNextInt();
       // System.out.println(b1);
      // String str = sc.next();
      String str = sc.nextLine();
       System.out.println(str);

        sc.close();
    }
    
}
