import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
public class StringCalculatorTest {
    private StringCalculator a;

    @BeforeEach
    public void setUp() {
        a = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        a = null;
    }

    @Test
    public void testAdd1() {
        assertThrows(IllegalArgumentException.class, () -> a.add("-1, 5"));
    }

    @Test
    public void testAdd2() {
        assertEquals(a.add("1, 1000"), 1);
    }
}
