package practice_programming.inheritance_practice;

public class Use {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.act();

        Child child = new Child();
        child.act(". Yes it is");

        Child.move();
        Parent.move();
    }
}
