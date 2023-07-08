import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateUtilTest {

    @Test
    public void leapYearTest()
    {
        assertTrue(DateUtil.isLeapYear(1992));
    }
    @Test
    public void nonLeapYearTest()
    {
        assertFalse(DateUtil.isLeapYear(1991));
    }
    @Test
    public void centuryYearsAreNotLeap()
    {
        assertFalse(DateUtil.isLeapYear(1900));
    }
    @Test
    public void centuryYearsAreLeap()
    {
        assertTrue(DateUtil.isLeapYear(2000));
    }

}