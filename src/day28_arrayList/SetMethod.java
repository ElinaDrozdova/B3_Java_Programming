package day28_arrayList;


import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        System.out.println(nums);

        nums.set(0, -100); // Update the OBJECT at the index of 0
        System.out.println(nums);

        //nums.set(4, 400); // IndexOutOfBoundsException
        nums.set(nums.size()-1, -900);
        System.out.println(nums);

    }
}