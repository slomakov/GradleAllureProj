import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 {

    @Test
    public void testMethod1() {
        Assert.assertTrue(true);
    }

    @Test
    public void testMethod2() {
        Assert.assertTrue(false);
    }

    @Test
    public void testMethod3() {
        Assert.assertTrue(true);
    }
}
