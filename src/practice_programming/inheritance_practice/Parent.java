package practice_programming.inheritance_practice;

public class Parent {
   public void act(){
        System.out.println("This method belongs to parent class");

    }

    void act(String str){
        System.out.println("This method belongs to parent class" + str);
    }

   public static void move(){
        System.out.println("This static method belongs to parent class");
    }
}
