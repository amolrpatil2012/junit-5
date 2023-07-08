import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AssertionTest {

    @Test
    public void testConvertToDoubleWithNullArgument()
    {
        String age = "100";
        Double actual = StringUtils.converToDouble(age);
        assertNotNull(actual,"Actual is Not Null");     // checks if actual is NOT NULL
        assertNotNull(actual,()->"Actual is Not Null");

        actual = StringUtils.converToDouble(null);
        assertNull(actual,"Actual is Null");        // checks if actual is NULL

    }

    @Test
    public void testConvertToDoubleWithThrowsException()
    {
        String s = "10";
        assertThrows(NumberFormatException.class,()->StringUtils.converToDouble(s)); // checks if function throws an Exception
    }

    @Test
    public void testIsNullOrBlankOK() {
        // Test the case that the input is NULL
        String input = null;

        assertTrue(StringUtils.isNullOrBlank(input));
        // Java 8 Lambdas Style
        assertTrue(StringUtils.isNullOrBlank(input), () -> "The string is not null or blank");

        // Test case with the input is empty
        input = " ";
        assertTrue(StringUtils.isNullOrBlank(input));

        // Test case with the input is not empty
        input = "abc";

        assertFalse(StringUtils.isNullOrBlank(input));

    }
    @Test
    public void testGetDefaultIfNull() {
        // Test case with input string is null
        String st = null;
        String defaultSt = "abc";

        String actual = StringUtils.getDefaultIfNull(st, defaultSt);
        assertSame(defaultSt, actual);
        // Java 8 Lambdas Style
        assertSame(defaultSt, actual, () -> "Expected ouput is not same with actual");

        // Test case with input string is not null
        st = "def";

        actual = StringUtils.getDefaultIfNull(st, defaultSt);
        assertNotSame(defaultSt, actual);
        // Java 8 Lambdas Style
        assertNotSame(defaultSt, actual, () -> "Expected ouput is same with actual");

        // Test case with input string is empty
        st = "";
        actual = StringUtils.getDefaultIfNull(st, defaultSt);
        if (actual.equals(defaultSt)) {
            fail("The actual should be empty");

            // Java 8 Lambdas Style
            fail(() -> "The actual should be empty");
        }

    }
}
