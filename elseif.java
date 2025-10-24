import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //int marks = sc.nextInt();
        System.out.print("Enter Marks : ");
        int marks = sc.nextInt();
        // marks >= 90 A
        // marks >= 75 B
        // marks >= 60 C
        // D

        if(marks>=90){
            System.out.println("grade A");
        }else if(marks>=75){
            System.out.println("grade B");
        }else if(marks>=60){
            System.out.println("grade C");
        }else{
            System.out.println("grade D");
        }
        sc.close();
    }
}
