import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> Numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao day so nguyen: ");
        int number = sc.nextInt();
        for(int i = 0; i < number; i ++){
            System.out.print("So thu " + (i) + ":");
            int Input = sc.nextInt();
            Numbers.add(Input);
        }
        Integer[] numberArray = Numbers.toArray(new Integer[0]);
        for(Integer num : numberArray){
            System.out.println(num);
        }

    }
}
