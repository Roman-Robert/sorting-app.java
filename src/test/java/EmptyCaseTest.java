import org.junit.Assert;
import org.junit.Test;
import sortingApp.Sorting;

import java.util.ArrayList;

public class EmptyCaseTest extends Sorting {

    /**
     * Test for empty ArrayList case.
     * Empty array list in - empty array list out (nothing to sort).
     */
    @Test
    public void testZeroCase() {
        ArrayList<Integer> emptyArrayList = new ArrayList<>();
        Assert.assertTrue(sortingArray(emptyArrayList).isEmpty());
    }
}
