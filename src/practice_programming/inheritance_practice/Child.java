package practice_programming.inheritance_practice;

public class Child extends Parent{
    @Override
    public void act(){
    System.out.println("This method belongs to child class");


   }

  public static void move(){
    System.out.println("This static method belongs to child class");
   }
}
