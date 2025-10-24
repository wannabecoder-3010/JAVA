package oops1java;

 public class Dog {
    
    String name;

    public void eat(){
        System.out.println(name + " eats!");
    }
}

 class oops1java{
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Candy";
        dog1.eat();
    }
}




