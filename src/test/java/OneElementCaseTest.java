import org.junit.Assert;
import org.junit.Test;
import sortingApp.Sorting;

import java.util.ArrayList;

public class OneElementCaseTest extends Sorting {

    @Test
    public void testOneElementCase() {
        ArrayList<Integer> firstArrayList = new ArrayList<>();
        ArrayList<Integer> secondArrayList = new ArrayList<>();

        firstArrayList.add(0);
        secondArrayList.add(Integer.MAX_VALUE);

        Assert.assertEquals(sortingArray(firstArrayList), firstArrayList);
        Assert.assertEquals(sortingArray(secondArrayList), secondArrayList);
    }
}
