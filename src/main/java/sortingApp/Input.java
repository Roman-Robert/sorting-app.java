package sortingApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    public static ArrayList<Integer> inputArray() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter a sequence of integers values");
        for (int i = 0; i < 10; i++) {
            if (scanner.hasNextInt()) arrayList.add(scanner.nextInt());
            else {
                System.out.println("You entered not integer value. Result:");
                break;
            }
        }
        return arrayList;
    }
}
