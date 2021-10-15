
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class StringCalculatorTest {
    // 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
    @Test
    void testEmptyString(){
        assertEquals(0,StringCalculator.add(""));
    }

    @Test
    void testOneNumber()
    {
        assertEquals(1,StringCalculator.add("1"));
    }
}
