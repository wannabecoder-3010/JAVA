import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input in kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();

        // 1 kilometer = 0.621371 miles
        double miles = kilometers * 0.621371;

        // Output result
        System.out.print(kilometers + " kilometers = " + miles + " miles");

        sc.close();
    }
}

    

