import java.util.Scanner;
public class Exercise_1 {
    public static void main(String[] args) {
        System.out.println("Calculating percentage of a student");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter physics marks:");
        int m1 = sc.nextInt();
        System.out.print("Enter maths marks:");
        int m2 = sc.nextInt();
        System.out.print("Enter chemistry marks:");
        int m3 = sc.nextInt();
        System.out.print("Enter english marks:");
        int m4 = sc.nextInt();
        System.out.print("Enter computer marks:");
        int m5 = sc.nextInt();

        int totalMarks = m1 + m2 + m3 + m4 + m5;
        int percentage = totalMarks * 100/500;

        System.out.print("percentage =");
        System.out.println(percentage);
        sc.close();

    }
    
}
