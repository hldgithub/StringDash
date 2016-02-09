import org.junit.Assert;
import org.junit.Test;


public class TestStringDash {

    @Test
    public void testDashedString() {
        String beforeDashes = "ABCDEFG";
        String afterDashes = "A-B-C-D-E-F-G";

        String dashedResult = StringDash.insertDashes(beforeDashes);
        Assert.assertEquals("String is not formatted with dashes correctly.", afterDashes, dashedResult);
    }

}
