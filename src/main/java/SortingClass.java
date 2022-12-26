import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Введите последовательность целых чисел");
        for (int i = 0; i < 10; i++) {
            if (scanner.hasNextInt()) arrayList.add(i, scanner.nextInt());
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
