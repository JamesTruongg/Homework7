import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Updates {
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
        Numbers.set(2,100); // update index 2 = 100;
        System.out.println(" " + Arrays.toString(Numbers.toArray()));
    }
}
