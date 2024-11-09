import java.util.ArrayList;
import java.util.Scanner;

public class Cities {
    public static void main(String[] args) {
        ArrayList<String>Cities = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong thanh pho: ");
        int city = sc.nextInt();sc.nextLine();
        for(int i = 0; i < city; i++){
            System.out.print("Nhap vao thanh pho " + (i) + ":");
            String Input = sc.nextLine();
            Cities.add(Input);
            System.out.println("Thanh pho " +(i) + ": " + Cities.get(i));
        }
    }
}
