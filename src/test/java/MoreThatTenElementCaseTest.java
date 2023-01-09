import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import sortingApp.Sorting;

import java.util.ArrayList;

@RunWith(Parameterized.class)
public class MoreThatTenElementCaseTest extends Sorting {

    @Parameterized.Parameters
    public static ArrayList<ArrayList<Integer>> groupOfArrays() {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayListOne = new ArrayList<>();
        ArrayList<Integer> arrayListTwo = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            arrayListOne.add(i);
        }
        for (int i = 0; i < 11; i++) {
            arrayListTwo.add(-i);
        }
        arrayList.add(arrayListOne);
        arrayList.add(arrayListTwo);
        return arrayList;
    }

    private final ArrayList<Integer> first;

    public MoreThatTenElementCaseTest(ArrayList<Integer> first) {
        this.first = first;
    }

    /**
     * Test for more than ten elements case.
     *
     * @throws IllegalArgumentException should be thrown.
     */
    @Test(expected = IllegalArgumentException.class)
    public void moreThenTenElementCase() {
        sortingArray(first);
    }

}
