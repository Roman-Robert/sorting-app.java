import org.junit.Assert;
import org.junit.Test;
import sortingApp.Sorting;


public class SortingTest extends Sorting {

    @Test(expected = NullPointerException.class)
    public void testNullCase() {
        Assert.assertNull(sortingArray(null));
    }
}

