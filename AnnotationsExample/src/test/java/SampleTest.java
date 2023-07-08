import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    boolean isPalindrome(String s)
    {
        return s.equalsIgnoreCase( new StringBuffer(s).reverse().toString());
    }
    @Test
    void firstTest()
    {
        assertEquals(2,1+1);
    }


    @DisplayName("Check for Palindrome")
    @ParameterizedTest
    @ValueSource(strings = {"racecar","radar","demo"})
    void palindrome(String s)
    {
        assertTrue(isPalindrome(s));
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    void add(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.add(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

}