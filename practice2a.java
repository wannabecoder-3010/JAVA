// write java program to encrypt a grade by adding 8 into it.Decrypt it to show the correct grade.

public class practice2a {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);


        // decrypting it:
        grade = (char)(grade - 8);
        System.out.println(grade);

        
    }


    
}
