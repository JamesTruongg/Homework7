import java.util.ArrayList;
import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> addFriends = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so lượng bạn can them: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            System.out.print("Nhap ten ban thu " + (i + 1) + ": ");
            String input = sc.nextLine();
            addFriends.add(input);

        }
        System.out.println("Ket qua xoa 'Tam': " + addFriends.remove("Tam"));
        System.out.print("Danh sach ban be còn lai: ");
        for(String friend : addFriends) {
            System.out.print(" " + friend);
        }
    }
}
