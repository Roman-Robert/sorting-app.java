package sortingApp;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

    public static ArrayList<Integer> sortingArray(ArrayList<Integer> arrayList) throws IllegalArgumentException {
        if (arrayList.size() <= 10) Collections.sort(arrayList);
        else throw new IllegalArgumentException();
        Collections.sort(arrayList);

        return arrayList;
    }
}
