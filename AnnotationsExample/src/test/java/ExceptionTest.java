import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionTest {

    @Test
    public void convertToIntNullParameterAssertThrows() {
        String st = null;
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtils.convertToInt(st);
        });

    }
    @Test
    public void convertToIntNullParameterTryCatchIdiom() {
        String st = "10";
        try {
            StringUtils.convertToInt(st);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("String must be not null or empty", e.getMessage());
        }
    }
}
