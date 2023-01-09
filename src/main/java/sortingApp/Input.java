package sortingApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    /**
     * Method accepts integer values from console.
     * The method accepts no more than 10 integer values (or up to the first not-integer value received).
     * Enter non-integer value for exit from input data.
     *
     * @return ArrayList with entered integer values (in order of input).
     */
    public static ArrayList<Integer> inputArray() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter a sequence of integers values");
        for (int i = 0; i < 10; i++) {
            if (scanner.hasNextInt()) arrayList.add(scanner.nextInt());
            else {
                System.out.println("Non-integer value entered. Input is over.");
                break;
            }
        }
        return arrayList;
    }
}
