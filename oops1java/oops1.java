package oops1java;

public class oops1 {

    String name;
    int roll_no;

    public void printdata(){
        System.out.println(name);
        System.out.println(roll_no);
    }

    public static void main(String[] args) {
        oops1 std1 = new oops1();
        std1.name = "Atul";
        std1.roll_no = 55;

        System.out.println(std1.name);
        System.out.println(std1.roll_no);
        std1.printdata();

        oops1 std2 = new oops1();
        std2.name = "jbcvjcxhb";
        std2.roll_no = 56;

        std2.printdata();
    }
    
}
