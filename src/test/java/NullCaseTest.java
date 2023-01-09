import org.junit.Assert;
import org.junit.Test;
import sortingApp.Sorting;

public class NullCaseTest extends Sorting {

    /**
     * Test for null ArrayList case.
     *
     * @throws NullPointerException should be thrown.
     */
    @Test(expected = NullPointerException.class)
    public void testNullCase() {
        Assert.assertNull(sortingArray(null));
    }
}
