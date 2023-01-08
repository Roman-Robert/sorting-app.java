package sortingApp;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    /**
     * The sortingArray method takes ArrayList with integer values and sorts it in ascending order.
     * @return As a result, method returns sorted ArrayList with entered integer values (in ascending order).
     * @throws IllegalArgumentException can be thrown.
     */
    public static ArrayList<Integer> sortingArray(ArrayList<Integer> arrayList) throws IllegalArgumentException {
        if (arrayList.size() <= 10) Collections.sort(arrayList);
        else throw new IllegalArgumentException();
        Collections.sort(arrayList);

        return arrayList;
    }
}
