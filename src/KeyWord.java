import java.util.ArrayList;
import java.util.Scanner;

public class KeyWord {
    public static void main(String[] args) {
        ArrayList<String> Keywords = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong keywords: ");
        int keyword = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < keyword; i++) {
            System.out.print("Nhap keywords thu " + (i) + ":");
            String Input = sc.nextLine();
            Keywords.add(Input);
        }
        if (Keywords.contains("Python")) {
            System.out.println("(Python) co trong danh sach.");
        } else {
            System.out.println("(Python) khong co trong danh sach.");
        }
    }

}
