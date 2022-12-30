import org.junit.Assert;
import org.junit.Test;
import sortingApp.Sorting;

import java.util.ArrayList;

public class EmptyCaseTest extends Sorting {
    @Test
    public void testZeroCase() {
        ArrayList<Integer> emptyArrayList = new ArrayList<>();
        Assert.assertEquals(sortingArray(emptyArrayList), emptyArrayList);
    }
}
