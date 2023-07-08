import org.junit.jupiter.api.*;

public class GeneralTest {

    @BeforeAll
    static void initAll()
    {
        System.out.println("Run Before All methods once");
    }
    @BeforeEach
    void init()
    {
        System.out.println("Run before each test method");
    }
    @AfterAll
    static void destroyAll()
    {
        System.out.println("Run After All methods once");
    }
    @AfterEach
    void destroy()
    {
        System.out.println("Run After each test method");
    }
    @DisplayName("First test")
    @Test
    void testMethod1() {
        System.out.println("    Test method 1");

    }


    @Test
    @Disabled
    void testMethod2() {
        System.out.println("  Test method 2");
    }

    @Test
    void testMethod3() {
        System.out.println("    Test method 3");

    }


}
