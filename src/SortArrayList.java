import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {
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
        System.out.println("Mang chua sap xep: ");
        System.out.println(" " + Arrays.toString(Numbers.toArray()));
        Collections.sort(Numbers);// update index 2 = 100;
        System.out.println("Mang sau khi sap xep: ");

        System.out.println(" " + Arrays.toString(Numbers.toArray()));
    }
}
