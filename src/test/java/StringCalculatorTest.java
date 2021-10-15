
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class StringCalculatorTest {
    // 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
    @Test
    void testEmptyString(){
        assertEquals(0,StringCalculator.add(""));
    }

    @Test
    void testOneNumberHardCoded()
    {
        assertEquals(1,StringCalculator.add("1"));
    }
    @Test
    void testOneNumber()
    {
        assertEquals(4,StringCalculator.add("4"));
    }

    @Test
    void testTwoNumber_OneAndTwo()
    {
        assertEquals(3,StringCalculator.add("1,2"));
    }
}
