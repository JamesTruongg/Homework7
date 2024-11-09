import java.util.ArrayList;
import java.util.Arrays;

public class Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Thêm các phần tử vào ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);


        System.out.println("Ket qua xoa phan tu (5): " +  numbers.remove(Integer.valueOf(5)));
        System.out.println("Cac phan tu con lai: " + Arrays.toString(numbers.toArray()));
    }
}
