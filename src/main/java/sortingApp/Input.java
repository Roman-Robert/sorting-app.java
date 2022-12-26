package sortingApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    public static ArrayList<Integer> inputArray() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Введите последовательность целых чисел");
        for (int i = 0; i < 10; i++) {
            if (scanner.hasNextInt()) arrayList.add(i, scanner.nextInt());
            else break;
        }
        return arrayList;
    }
}
